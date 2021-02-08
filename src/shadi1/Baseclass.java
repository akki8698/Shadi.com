package shadi1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	WebDriver driver;
	
	public void browseropwen() {
		 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\New folder (5)\\chromedriver.exe");
        driver =new ChromeDriver();
       
        driver.get("https://www.shaadi.com/");
     
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       driver.manage().window().maximize();
	}

}
