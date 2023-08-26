package flipkart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class homepage {
	
	@FindBy(xpath="//a[text()='Login']")private WebElement loginclick;

	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")private WebElement cross;
	
	@FindBy(xpath="(//div[@class='eFQ30H'])[1]")private WebElement grocery;
	
	public homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickcross() {
		loginclick.click();
	    cross.click();	
	}
	
	public void checkgrocery() {
		Assert.assertTrue(grocery.isDisplayed());
	}
	
	public void checkLogin() {
		Assert.assertTrue(loginclick.isDisplayed());
	}
	
	
}
