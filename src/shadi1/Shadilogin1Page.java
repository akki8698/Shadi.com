package shadi1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shadilogin1Page {
	@FindBy(xpath="//a[text()='Login']")
	 private WebElement log;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement UN;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement PASS;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement LOGIN;
	
	
	public Shadilogin1Page( WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	
	public void ShadiloginPagelog() {
		 log.click();
	}
	
	public void ShadiloginPageUN() {
		 UN.sendKeys("8806533354");
	 }
	 public void ShadiloginPagePASS() {
		 PASS.sendKeys("KPkp@#12");
	 }
	 public void ShadiloginPageLOGIN() {
		 LOGIN.click();
	 }
	 
	

}
