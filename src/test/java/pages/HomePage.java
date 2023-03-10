package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	WebDriver driver;
    WebElement userNameTextBox;
    WebElement passwordTextFiled;
    WebElement loginButton;
    	
    
	public HomePage (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebElement getUserNameTextBox() {
		this.setUserNameTextBox();
		return userNameTextBox;
	}

	public void setUserNameTextBox() {
		this.userNameTextBox = driver.findElement(By.xpath("//input[@name='userName']"));
	}

	public WebElement getPasswordTextFiled() {
		this.setPasswordTextFiled();
		return passwordTextFiled;
	}

	public void setPasswordTextFiled() {
		this.passwordTextFiled = driver.findElement(By.xpath("//input[@name='password']"));
	}

	public WebElement getLoginButton() {
		this.setLoginButto();
		return loginButton;
	}

	public void setLoginButto() {
		this.loginButton = driver.findElement(By.xpath("//input[@name='submit']"));
	}
	

}
