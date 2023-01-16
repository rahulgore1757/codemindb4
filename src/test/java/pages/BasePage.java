package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	WebDriver driver ;
	WebElement registrationlink;
	WebElement Homelink;
	
	public BasePage(WebDriver driver) {
      this.driver=driver;
	}

	public WebElement getRegistrationlink() {
		this.setRegistrationlink();
		return registrationlink;
	}

	public void setRegistrationlink() {
		this.registrationlink = driver.findElement(By.xpath("//a[text()='REGISTER']"));
	}

	public WebElement getHomelink() {
		this.setHomelink();
		return Homelink;
	}

	public void setHomelink() {
		this.Homelink = driver.findElement(By.xpath("//a[text()='Home']"));
	}

	
}
