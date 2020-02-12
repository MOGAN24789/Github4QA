package newtTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollUpOrDown {
	@Test
	public void scrollupordown() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.yahoo.com/");
		
		scrollUp(driver);
		Thread.sleep(2000);
		scrollDown(driver);
		
	}
	public void scrollUp(WebDriver a) {
		//JavascriptExecutor js = (JavascriptExecutor)a;
		//js.executeScript("scroll(0,2000)");	
		((JavascriptExecutor)a).executeScript("scroll(0,2000)");
	}
	public void scrollDown(WebDriver a) {
		//JavascriptExecutor js = (JavascriptExecutor)a;
		//js.executeScript("scroll(2000,0)");	
		((JavascriptExecutor)a).executeScript("scroll(2000,0)");
	}
	
	
	
	
	
	
	
	public void ExpWait(WebDriver driver, int waitTimeInSecs, By ElementLocator) {
		 
		WebDriverWait wait = new WebDriverWait(driver, waitTimeInSecs);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ElementLocator));
	}
		
	}


