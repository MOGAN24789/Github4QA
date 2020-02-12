package newtTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleiFrames {
	
	@Test
	public void handleiFrames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Go to oracle website
		//click on java.awt.color link
		//Click on the ColorSpace link
		//Click on Serializable link
		//Validate "Interface Serializable showed
		
		
		driver.navigate().to("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(3000);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt.color")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.linkText("ColorSpace")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Serializable")).click();
		
		
	}

}
