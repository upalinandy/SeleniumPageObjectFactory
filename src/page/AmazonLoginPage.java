package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLoginPage {
	WebDriver driver;
	WebDriverWait dynamicwait;
	
	public AmazonLoginPage(WebDriver driver, WebDriverWait dynamicwait){
		this.driver = driver;
		this.dynamicwait = dynamicwait;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nav-link-yourAccount")
	WebElement signin;
	@FindBy(id = "ap_email")
	WebElement email;
	@FindBy(id = "ap_password")
	WebElement password;
	@FindBy(id = "signInSubmit")
	WebElement go;
	
	public WebElement SignInLink(){
			return signin;
		}
		
	public WebElement EmailId(){
		dynamicwait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));
		return email;
	}
	
	public WebElement Passwd(){
		return password;
	}
	
	public WebElement Submit(){
		return go;
	}

	

}
