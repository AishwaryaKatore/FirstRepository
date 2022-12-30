package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;



public class PO_Ecommerce {
	WebDriver driver;
	public PO_Ecommerce(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using ="//input[@id='useremail']")
    WebElement Txt_Email;

	@FindBy(how=How.XPATH, using ="//input[@id='password']")
	WebElement Txt_Password;
	    
	@FindBy(how=How.XPATH, using ="//button")
	WebElement button_SignIn;
	
    
	@FindBy(how=How.XPATH, using ="(//a[@class='sidebar-sub-toggle'])[2]")
	WebElement button_Product;
	
	@FindBy(how=How.XPATH, using ="//a[@href='https://products.pisystindia.com/Ecommerce/admin/category']")
	WebElement button_Category;
	
	@FindBy(how=How.XPATH, using ="//a[@title='Edit Category Image!'])[1]")
	WebElement button_Action_Image;
	
	@FindBy(how=How.XPATH, using ="//i[@class='fa fa-file-archive-o']")
	WebElement updateImage;
	
	@FindBy(how=How.XPATH, using ="//button[@type='submit']")
	WebElement button_Update;
	
	public void Email(String Email)
	 {
	       Txt_Email.sendKeys(Email);
	  }
	 public void Password(String Password) 
	    {
		 Txt_Password.sendKeys(Password);
	   }
	 public void signIn()
	    {
		button_SignIn.click();
	   }
	 public void Product()
	    {
		button_Product.click();
	   }
	 public void Category()
	    {
		button_Category.click();
	   }
	 public void Action()
	    {
		button_Action_Image.click();
	   }
	 public void UpdateImage(String Image)
		{
		
		 updateImage.sendKeys(Image);

		}
	 public void Update()
	    {
		button_Update.click();
	   }


	 public void valid_data(String email,String Password,String Image  )
		{
			try {
				Email(email);
				Password(Password);
				signIn();
				Product();
				Category();
				Action();
				Thread.sleep(2000);
				UpdateImage(Image);
				Thread.sleep(2000);
				Update();
				
			}	
			catch(Exception ex)
			{
				ex.getStackTrace();

			}
		}
}
