package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyLoginOrangeHrm {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		driver.findElement(By.id("welcome")).click();
		
		WebDriverWait waitfor = new WebDriverWait(driver,10);
		waitfor.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		WebElement target = driver.findElement(By.id("welcome-menu"));
		Actions action = new Actions(driver);
		action.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
