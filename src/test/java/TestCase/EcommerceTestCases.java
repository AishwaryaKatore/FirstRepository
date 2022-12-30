package TestCase;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_Ecommerce;
import Utility.BrowserManager;

public class EcommerceTestCases {

		WebDriver driver;
		JSONObject ecommerce;
		
		
		@BeforeClass
		public void beforeClass()throws Exception
		{
			InputStream details = null;;
			try {
				String Filename="data/Ecommerce.json";
				details=getClass().getClassLoader().getResourceAsStream(Filename);
				JSONTokener tkn = new JSONTokener(details);
				ecommerce=new JSONObject(tkn);
				
				System.out.println("data is:"+ecommerce.toString());
				

				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			@BeforeMethod
			@Parameters({"browser","url"})
			public void setup(String browser,String url)throws InterruptedException	{
				driver=BrowserManager.getdriver(browser);
				Thread.sleep(2000);
				driver.get(url);
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				Thread.sleep(2000);
				
			}
			@Test(priority=1)
			public void ValidData()
			{
				
				String Email=ecommerce.getJSONObject("valid_data").getString("Email");
				String Password=ecommerce.getJSONObject("valid_data").getString("Password");
				String Image=ecommerce.getJSONObject("valid_data").getString("Image");

				PO_Ecommerce obj=PageFactory.initElements(driver, PO_Ecommerce.class);
				obj.valid_data(Email, Password,Image );
				
			}
			@AfterMethod
			public void tearDown()
			{
				driver.close();
			}
			@AfterClass
			public void afterclass()
			{
			}

}

