package newtTestProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingMouseOver {

	@Test
	public void handlingMouseOver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.dell.com/en-us?~ck=mn");
		//Action class is used to HoverOver
		Actions action = new Actions(driver);
		WebElement pro = driver.findElement(By.xpath("//button[@id='l1_0']"));
		Thread.sleep(2000);
		action.moveToElement(pro).build().perform();
		
		ExpWait(driver, 15, By.linkText("Workstations"));
		driver.findElement(By.linkText("Workstations")).click();
		
		ExpWait(driver, 15, By.xpath("//h1[contains(text(),'Workstation' ) and contains(text(), 'Precision')]"));
		
	}
	public void ExpWait(WebDriver driver, int waitTimeInSecs, By ElementLocator) {
		 
		WebDriverWait wait = new WebDriverWait(driver, waitTimeInSecs);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ElementLocator));
	}

}
