package newtTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {

	@Test
	public void secondtestcase() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.xpath("//input[@name='login']")).sendKeys("aha");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("bba");
		Thread.sleep(3000);
		//xpath Axis : //input[@name='FormName']/following-sibling::div/descendant::input[@value='Sign in']
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}
}
