package shadi1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shadihome1Page {
	
	@FindBy(xpath="//div[contains(text(),'Premium Matches')]")
	 private WebElement premiummatch;
	
	@FindBy(xpath="(//div[@id='recently-joined'])[1]/child::div[1]/descendant::button[1]")
	 private WebElement display;
	
	@FindBy(xpath="//div[contains(text(),'New Matches for you')]")
	 private WebElement newmatch;
	
	@FindBy(xpath="(//div[@id='recently-joined'])[2]/child::div[1]/descendant::button[1]")
	 private WebElement display1;
	
	public Shadihome1Page ( WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	public void  Shadihome1Pagepremiummatch() {
		premiummatch.click();
	 }
	 public boolean Shadihome1Pagedisplay() {
		boolean actual = display.isDisplayed();
		return actual;
	 }
	 public void Shadihome1Pagenewmatch() {
		 newmatch.click();
	 }
	 public boolean Shadihome1Pagedisplay1() {
		boolean actual = display1.isDisplayed();
		return actual;

}
}
