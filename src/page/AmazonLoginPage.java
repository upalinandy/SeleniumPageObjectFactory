package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLoginPage {
	WebDriver driver;
	WebDriverWait dynamicwait;
	By signin = By.id("nav-link-yourAccount");
	By email = By.id("ap_email");
	By password = By.id("ap_password");
	By go = By.id("signInSubmit");
	
	public AmazonLoginPage(WebDriver driver, WebDriverWait dynamicwait){
		this.driver = driver;
		this.dynamicwait = dynamicwait;
	}
			
	public WebElement SignInLink(){
			return driver.findElement(signin);
		}
		
	public WebElement EmailId(){
		dynamicwait.until(ExpectedConditions.presenceOfElementLocated(email));
		return driver.findElement(email);
	}
	
	public WebElement Passwd(){
		return driver.findElement(password);
	}
	
	public WebElement Submit(){
		return driver.findElement(go);
	}

	

}
