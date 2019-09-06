package SampleDP.gittest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
		WebDriver driver;
		@Test
		public void validLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Dhanashree\\Selenium\\chromedriver.exe");	
		driver = new ChromeDriver();
	
		String eTitle = "Meet Guru99";
		String aTitle = "";
		
		driver.get("http://guru99.com");
		driver.manage().window().maximize();
		
		aTitle=driver.getTitle();
		if(aTitle.contentEquals(eTitle))
		{
			System.out.println("Test passed!");
		}
		else
		{
			System.out.println("Test Failed!, Try again");
		}
		driver.close();
		}	
			
}

