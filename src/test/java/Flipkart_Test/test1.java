package Flipkart_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flipkart.homepage;
import flipkart.homepage2;

public class test1 {

	WebDriver driver;
	homepage hm;
	homepage2 hm2;
	
	@BeforeMethod
	public void launchBrowser() {
		
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        hm=new homepage(driver);
	}
	
    //@Test
    public void testGrocery() {
    	
    	
    	
    	hm.checkgrocery();
    	
    }
    
    @Test
    public void testLogin() {
    	
    	hm.checkLogin();
    }
	
	@AfterMethod
	public void closeBrowser() {
		homepage hm=null;
		driver.close();
	}
	
}
