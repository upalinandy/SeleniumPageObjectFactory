package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	WebDriver driver;
	WebDriverWait dynamicwait;
	By searchbox = By.id("twotabsearchtextbox");
	By item = By.linkText("Pastorable Canvas Pen Pencil Stationery Pouch Bag Case,set of 4");
	By addtocart = By.id("submit.add-to-cart");
	By window = By.linkText("Details");

	public AmazonHomePage(WebDriver driver,WebDriverWait dynamicwait) {
		this.driver = driver;
		this.dynamicwait = dynamicwait;
	}
	
	public WebElement Search(){
		return driver.findElement(searchbox);
	}

	public WebElement SelectItem(){
		return driver.findElement(item);
	}
	
	public WebElement AddToCart(){
		return driver.findElement(addtocart);
	}
	
	public WebElement ChildWindow(){
		dynamicwait.until(ExpectedConditions.presenceOfElementLocated(window));
		return driver.findElement(window);
	}
	
	
}
