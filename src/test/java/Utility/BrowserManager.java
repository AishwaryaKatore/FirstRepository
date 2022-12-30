
package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
	static WebDriver driver=null; 

		public static WebDriver getdriver(String type)
		{
			if(type.equalsIgnoreCase("chrome"));
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
		
			}
			return driver;
		}
	}





