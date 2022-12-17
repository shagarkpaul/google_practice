package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class walmart_Home_page  {
	
	
	WebDriver driver;
	
	public walmart_Home_page(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='ld ld-Grid mr2']")
	WebElement item1;
	
	public void mouse_over1() {
		Actions act = new Actions(driver);
		act.moveToElement(item1).click().build().perform();
	}
	
	@FindBy(xpath = "(//button[@type='button'])[8]")
	WebElement item2;
	public void mouse_over2() {
		Actions act = new Actions(driver);
		act.moveToElement(item2).build().perform();
	}
	
	
	

}
