package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	String usernameLocater = "//input[@name='username']";
	String passwordLocater = "//input[@name='password']";
	String sublitLocater = "//button[@type='submit']";
	String searchLocater = "//input[@placeholder='Search']";

	@SuppressWarnings("deprecation")
	public void HrmLogin(String username, String password) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(usernameLocater)).sendKeys(username);
		driver.findElement(By.xpath(passwordLocater)).sendKeys(password);
		driver.findElement(By.xpath(sublitLocater)).click();
	}
}
