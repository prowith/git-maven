package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homepage2 {

	//@FindBy(xpath="//a[text()='Login']")private WebElement loginclick;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")private WebElement cross;
	
	@FindBy(xpath="(//div[@class='eFQ30H'])[2]")private WebElement mobiles;
	
	
	public homepage2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	
	public void clickCross() {
		//loginclick.click();
		cross.click();
	}
	
	
	public void testMobile() {
		Assert.assertTrue(mobiles.isDisplayed());
	}
}
