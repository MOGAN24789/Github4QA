package newtTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNewTabOrWindow {
	@Test
	public void handleNewTabOrWindow () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.yahoo.com/");
		
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("xpath");
		driver.findElement(By.xpath("//button[@id=\"header-desktop-search-button\"]")).click();
		driver.findElement(By.linkText("XPath Tutorial - w3schools.com")).click();
		
		for( String windowHandle: driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
		}
		Thread.sleep(2000);
		driver.findElement(By.linkText("SQL")).click();
		
	}
}
