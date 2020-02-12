package newtTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechfiosHW2SEL {
	
	@Test
	public void homework2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://techfios.com/test/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");;
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");;
		driver.findElement(By.xpath("//button[@type='submit']")).click();;
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='nav-label' and contains(text(), 'Transactions')]")).click();
		driver.findElement(By.linkText("Transfer")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='faccount']//option[text()='account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='taccount']//option[text()='loan']")).click();
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Going debt free");
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("69969");
		//driver.findElement(By.xpath("//span[@class='select2 select2-container select2-container--bootstrap select2-container--below select2-container--focus select2-container--open']")).sendKeys("xyxyxoxo");
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		
	}
		
	}


