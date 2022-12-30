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


import PO.PO_pisystindia;
import Utility.BrowserManager;


public class pisystindiaTestCases {
	WebDriver driver;
	JSONObject Pisystindia;
	
	
	@BeforeClass
	public void beforeClass()throws Exception
	{
		InputStream details = null;;
		try {
			String Filename="data/pisystindia.json";
			details=getClass().getClassLoader().getResourceAsStream(Filename);
			JSONTokener tkn = new JSONTokener(details);
			Pisystindia=new JSONObject(tkn);
			
			System.out.println("data is:"+Pisystindia.toString());
			

			
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
			Thread.sleep(1000);
			driver.get(url);
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(1000);
			
		}
		
		@Test(priority=1)
		public void ValidData()
		{
			
			String Email=Pisystindia.getJSONObject("valid_data").getString("Email");
			String Password=Pisystindia.getJSONObject("valid_data").getString("Password");
			String CouponCode=Pisystindia.getJSONObject("valid_data").getString("CouponCode");

			PO_pisystindia obj=PageFactory.initElements(driver, PO_pisystindia.class);
			obj.valid_data(Email, Password,CouponCode );
			
		}
		
		@Test(priority=2)
		public void Blankdata()
		{
			
			String Email=Pisystindia.getJSONObject("Blank_data").getString("Email");
			String Password=Pisystindia.getJSONObject("Blank_data").getString("Password");
			String CouponCode=Pisystindia.getJSONObject("Blank_data").getString("CouponCode");

			PO_pisystindia obj=PageFactory.initElements(driver, PO_pisystindia.class);
			obj.Blank_data(Email, Password,CouponCode );
			
		}
		@Test(priority=3)
		public void SpecialCharacterdata()
		{
			
			String Email=Pisystindia.getJSONObject("SpecialCharacter_data").getString("Email");
			String Password=Pisystindia.getJSONObject("SpecialCharacter_data").getString("Password");
			String CouponCode=Pisystindia.getJSONObject("SpecialCharacter_data").getString("CouponCode");

			PO_pisystindia obj=PageFactory.initElements(driver, PO_pisystindia.class);
			obj.SpecialCharacter_data(Email, Password,CouponCode );
			
		}
		@Test(priority=4)
		public void DoubleSpacedata()
		{
			
			String Email=Pisystindia.getJSONObject("DoubleSpace_data").getString("Email");
			String Password=Pisystindia.getJSONObject("DoubleSpace_data").getString("Password");
			String CouponCode=Pisystindia.getJSONObject("DoubleSpace_data").getString("CouponCode");

			PO_pisystindia obj=PageFactory.initElements(driver, PO_pisystindia.class);
			obj.DoubleSpace_data(Email, Password,CouponCode );
			
		}
		
		@Test(priority=5)
		public void LessThanThreeChardata()
		{
			
			String Email=Pisystindia.getJSONObject("LessThanThreeChar_data").getString("Email");
			String Password=Pisystindia.getJSONObject("LessThanThreeChar_data").getString("Password");
			String CouponCode=Pisystindia.getJSONObject("LessThanThreeChar_data").getString("CouponCode");

			PO_pisystindia obj=PageFactory.initElements(driver, PO_pisystindia.class);
			obj.LessThanThreeChar_data(Email, Password,CouponCode );
			
		}
		@Test(priority=6)
		public void MoreThanThreeChardata()
		{
			
			String Email=Pisystindia.getJSONObject("MoreThanThreeChar_data").getString("Email");
			String Password=Pisystindia.getJSONObject("MoreThanThreeChar_data").getString("Password");
			String CouponCode=Pisystindia.getJSONObject("MoreThanThreeChar_data").getString("CouponCode");

			PO_pisystindia obj=PageFactory.initElements(driver, PO_pisystindia.class);
			obj.MoreThanThreeChar_data(Email, Password,CouponCode );
			
		}
	
		@Test(priority=7)
		public void NumericalandSpecialChardata()
		{
			
			String Email=Pisystindia.getJSONObject("NumericalandSpecialChar_data").getString("Email");
			String Password=Pisystindia.getJSONObject("NumericalandSpecialChar_data").getString("Password");
			String CouponCode=Pisystindia.getJSONObject("NumericalandSpecialChar_data").getString("CouponCode");

			PO_pisystindia obj=PageFactory.initElements(driver, PO_pisystindia.class);
			obj.NumericalandSpecialChar_data(Email, Password,CouponCode );
			
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
