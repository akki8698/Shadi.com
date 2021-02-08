package shadi1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadihomePage {
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[3]/button[1]/preceding::a")
	 private WebElement skip;
	
	@FindBy(xpath="//button[text()='Ask me later']")
	private WebElement later;
	
	@FindBy(xpath="//a[text()='My Shaadi']")
	private WebElement shadiclick;
	
	ShadihomePage( WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	public void ShadihomePageskip() {
		 skip.click();
	 }
	 public void ShadihomePagelater() {
		 later.click();
	 }
	 public void ShadihomePageclick() {
		 shadiclick.click();
	 }

}
