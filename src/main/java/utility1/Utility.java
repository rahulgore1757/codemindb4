package utility1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	
	public WebDriver getWebDriver() {
		
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
 public static String getProperty(String key) {
	 Properties properties = null;
	 File file = new File("https://demo.guru99.com/test/newtours/index.php");
	 try {
		FileInputStream fileInputStream = new FileInputStream(file);//trycatch
	    properties=new Properties();
		try {
			properties.load(fileInputStream);
			properties.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return properties.getProperty(key);
  }
    
}
