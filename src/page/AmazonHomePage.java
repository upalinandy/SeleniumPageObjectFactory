package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	WebDriver driver;
	WebDriverWait dynamicwait;

	public AmazonHomePage(WebDriver driver,WebDriverWait dynamicwait) {
		this.driver = driver;
		this.dynamicwait = dynamicwait;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(linkText= "Pastorable Canvas Pen Pencil Stationery Pouch Bag Case,set of 4")
	WebElement item;
	
	@FindBy(id = "submit.add-to-cart")
	WebElement addtocart;
	
	@FindBy(linkText = "Details")
	WebElement window;
	
	public WebElement Search(){
		return searchbox;
	}

	public WebElement SelectItem(){
		return item;
	}
	
	public WebElement AddToCart(){
		return addtocart;
	}
	
	public WebElement ChildWindow(){
		dynamicwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Details")));
		return window;
	}
	
	
}
