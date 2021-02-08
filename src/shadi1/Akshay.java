package shadi1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Akshay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Desktop\\\\New folder (5)\\\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        
        driver.get("https://www.shaadi.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        
        Thread.sleep(2000);
        
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8806533354");
       
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("KPkp@#12");
       
       driver.findElement(By.xpath("//button[text()='Login']")).click();
       Thread.sleep(3000);
       
      
       
       driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[3]/button[1]/preceding::a")).click();
       
       
       Thread.sleep(5000);
      
       
       driver.findElement(By.xpath("//button[text()='Ask me later']")).click();
       
       driver.findElement(By.xpath("//a[text()='My Shaadi']")).click();
       
       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          boolean value = driver.findElement(By.xpath("//div[contains(text(),'Premium Matches')]")).isDisplayed();
          
       
         if(value){ 
    	   
        	 driver.findElement(By.xpath("(//div[@id='recently-joined'])[1]/child::div[1]/descendant::button[1]")).click();
    	   
       }
         
         
         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(10000);
         boolean value1 = driver.findElement(By.xpath("//div[contains(text(),'New Matches for you')]")).isDisplayed();
         
      
        if(value1){ 
   	   
       	 driver.findElement(By.xpath("(//div[@id='recently-joined'])[2]/child::div[1]/descendant::button[1]")).click();
   	   
       }
        
         WebElement close_button = driver.findElement(By.xpath("//button[@id='new-match-close-modal']"));
         boolean present = close_button.isDisplayed();
        if(present) {
        	close_button.click();
        }
	}



		
		

	}


