package shadi1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import pomwithdatadriven.KiteHomePage;
import pomwithdatadriven.KiteLogin1Page;
import pomwithdatadriven.KiteLogin2Page;

public class ShadiTest extends Baseclass {
	//  WebDriver driver;
	  
	Shadilogin1Page login1;
	ShadihomePage home;
	Shadihome1Page home1;
	 
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException {	
	
		
		 browseropwen();
         login1= new  Shadilogin1Page(driver);
         home= new ShadihomePage (driver);
         home1= new  Shadihome1Page(driver); 
	}
	
	@BeforeMethod
	public void loginToApp() {
		        login1.ShadiloginPagelog();
		        login1.ShadiloginPageUN();
		        login1.ShadiloginPagePASS();
		        login1.ShadiloginPageLOGIN();
		        home.ShadihomePageskip();
		        home.ShadihomePagelater();
		        home.ShadihomePageclick();
		        home1.Shadihome1Pagepremiummatch();
		        home1.Shadihome1Pagenewmatch();
		                       		 	
	}
	@Test 
	public void verifyWidget() {
		SoftAssert soft = new SoftAssert();
		
		soft.assertTrue(home1.Shadihome1Pagedisplay());
		soft.assertTrue(home1.Shadihome1Pagedisplay1());
		
        soft.assertAll();
		
		
	}
	
	@AfterMethod
	public void logoutFromApp() {	
	}
	@AfterClass
	public void closeBrowser() {
		login1=null;
		driver.close();	
	}

}
