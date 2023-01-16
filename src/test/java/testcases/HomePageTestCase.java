package testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import utility1.Utility;

public class HomePageTestCase {
	Utility utility;
	HomePage home;
	WebDriver driver;
	
	@BeforeMethod
    public void initilizatio()
    {
	this.driver = utility.getWebDriver();
	home=new HomePage(driver);
	driver.get(Utility.getProperty("url"));
    }
   @Test
   public void verifyValidLogin()
   {
	   home.getUserNameTextBox().sendKeys("admin");
	   home.getPasswordTextFiled().sendKeys("admin");
	   home.getLoginButton().click();
	   assertEquals(actual, expected);
   }
   @AfterMethod
   public void tearDown()
   {
	   
   }
}
