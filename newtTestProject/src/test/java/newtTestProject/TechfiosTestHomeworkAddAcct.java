package newtTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class TechfiosTestHomeworkAddAcct {
	//String expectedCondition = "Dashboard";

	@Test
	public void chromeSetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://techfios.com/test/billing/?ng=admin/");
		Thread.sleep(3000);
		System.out.println();
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");;
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");;
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();;
		
		Thread.sleep(2000);
//		//driver.findElement(By.xpath("//h2[contains(text(), Dashboard)]"));
//		WebElement dashboardTitle = driver.findElement(By.xpath("//h2[contains(text(), Dashboard)]"));
//		
//		wait.until(ExpectedConditions.invisibilityOf(dashboardTitle));
		WebDriverWait wait = new WebDriverWait(driver, 7);
		
		driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-xs\" and contains(text(), 'Add Deposit')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//select[@id='account']//option[text()='houseloan']")).click();
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Paying off mortgage");
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("69690");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	
	

}
