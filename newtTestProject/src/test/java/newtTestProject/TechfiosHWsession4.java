package newtTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechfiosHWsession4 {

	@Test
	public void crmHW() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://techfios.com/test/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");;
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");;
		driver.findElement(By.xpath("//button[@type='submit']")).click();;
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Add Contact')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Lil Wayne");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Young Money Inc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("carterWayne@youngmoney.co.uk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("6822466969");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("69 Techfios Ave");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Titosville");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("TX");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"zip\"]")).sendKeys("76120");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']")).sendKeys("0200820820");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(), 'List Contacts')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='uid1795']")).click();
		Thread.sleep(4000);
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@type='button' and contains(text(), 'OK')]")).click();
		
		
		
	}
}
