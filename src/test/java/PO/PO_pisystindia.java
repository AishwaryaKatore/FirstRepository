package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;



public class PO_pisystindia {
	WebDriver driver;
	public PO_pisystindia(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using ="//input[@id='useremail']")
    WebElement Txt_Email;

	@FindBy(how=How.XPATH, using ="//input[@id='password']")
	WebElement Txt_Password;
	    
	@FindBy(how=How.XPATH, using ="//button")
	WebElement button_SignIn;
	
	@FindBy(how=How.XPATH, using ="//i[@class='fa fa-hashtag']")
	WebElement button_Coupon;
	
	@FindBy(how=How.XPATH, using ="//a[@class='btn btn-success btn-flat m-b-10 m-l-5']")
	WebElement button_Add_Coupon;
	
	@FindBy(how=How.XPATH, using ="//input[@id='coupon_name']")
	WebElement Txt_Coupon_Code;
	
	@FindBy(how=How.XPATH, using ="//button[@type='submit']")
	WebElement button_Add;
	
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
	 public void Coupon()
	    {
		button_Coupon.click();
	   }
	 public void Add_Coupon()
	    {
		button_Add_Coupon.click();
	   }
	 public void CouponCode(String CouponCode)
	 {
	       Txt_Coupon_Code.sendKeys(CouponCode);
	  }
	 public void Add()
	    {
		button_Add.click();
	   } 
	 
	 public void valid_data(String Email,String Password,String CouponCode )
		{
			try {
				Email(Email);
				Password(Password);
				signIn();
				Coupon();
				Add_Coupon();
				CouponCode(CouponCode);
				Add();
				
			}	
			catch(Exception ex)
			{
				ex.getStackTrace();

			}
		}
	 
	 public void Blank_data(String Email,String Password,String CouponCode )
		{
			try {
				Email(Email);
				Password(Password);
				signIn();
				Coupon();
				Add_Coupon();
				CouponCode(CouponCode);
				Add();
				
			}	
			catch(Exception ex)
			{
				ex.getStackTrace();

			}
		}
	 public void SpecialCharacter_data(String Email,String Password,String CouponCode )
		{
			try {
				Email(Email);
				Password(Password);
				signIn();
				Coupon();
				Add_Coupon();
				CouponCode(CouponCode);
				Add();
				
			}	
			catch(Exception ex)
			{
				ex.getStackTrace();

			}
		}
	 public void DoubleSpace_data(String Email,String Password,String CouponCode )
		{
			try {
				Email(Email);
				Password(Password);
				signIn();
				Coupon();
				Add_Coupon();
				CouponCode(CouponCode);
				Add();
				
			}	
			catch(Exception ex)
			{
				ex.getStackTrace();

			}
		}
	 public void LessThanThreeChar_data(String Email,String Password,String CouponCode )
		{
			try {
				Email(Email);
				Password(Password);
				signIn();
				Coupon();
				Add_Coupon();
				CouponCode(CouponCode);
				Add();
				
			}	
			catch(Exception ex)
			{
				ex.getStackTrace();

			}
		}
	 public void MoreThanThreeChar_data(String Email,String Password,String CouponCode )
		{
			try {
				Email(Email);
				Password(Password);
				signIn();
				Coupon();
				Add_Coupon();
				CouponCode(CouponCode);
				Add();
				
			}	
			catch(Exception ex)
			{
				ex.getStackTrace();

			}
		}
	 public void NumericalandSpecialChar_data(String Email,String Password,String CouponCode )
		{
			try {
				Email(Email);
				Password(Password);
				signIn();
				Coupon();
				Add_Coupon();
				CouponCode(CouponCode);
				Add();
				
			}	
			catch(Exception ex)
			{
				ex.getStackTrace();

			}
		}
}
