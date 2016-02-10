package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.AmazonHomePage;
import page.AmazonLoginPage;

public class AmazonTest {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait dynamicwait = new WebDriverWait(driver, 20);
	private AmazonLoginPage al = new AmazonLoginPage(driver, dynamicwait);
	private AmazonHomePage ah = new AmazonHomePage(driver, dynamicwait);
	
	@BeforeClass
	public void beforeclass(){
	driver.get("http://www.amazon.com/");
	driver.manage().window().maximize();	
	}
	
	@Test
	public void Login(){
		al.SignInLink().click();
		al.EmailId().sendKeys("testmail02015@gmail.com");
		al.Passwd().sendKeys("india1947");
		al.Submit().click();	
	}
	
	@Test
	public void SearchBox(){
		ah.Search().sendKeys("pencil");
		ah.Search().sendKeys(Keys.DOWN);
		ah.Search().sendKeys(Keys.DOWN);
		ah.Search().sendKeys(Keys.ENTER);
		ah.SelectItem().click();
		ah.AddToCart().click(); 
		ah.ChildWindow().click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[@class='small show-if-js']")).click();
		}
	
	@AfterClass
	public void afterclass(){
		try{
			driver.quit();
		}
		catch(Exception e) {
			driver = null;
		}
	
	
}
	
	
}
	
		
	
	
		

	



