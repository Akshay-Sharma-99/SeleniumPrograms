package seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
//		driver.findElement(By.id("gender-female")).click();
//		driver.findElement(By.name("FirstName")).sendKeys("Kavya");
//		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Anupa");
//		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("anupa6@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("123456");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
//		driver.findElement(By.cssSelector("input[value='Register']")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("http://demowebshop.tricentis.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		

	}

}
