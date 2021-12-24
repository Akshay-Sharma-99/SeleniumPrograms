package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumSoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
//        First Alert box
        
//        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
//        Alert alt1=driver.switchTo().alert();
//        String alertmessage1=alt1.getText();
//        System.out.println(alertmessage1);
//        Thread.sleep(3000);
//        alt1.accept();

        
//        Second Alert box
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
        Alert alt2=driver.switchTo().alert();
        String alertmessage2=alt2.getText();
        Thread.sleep(3000);
        System.out.println(alertmessage2);
        alt2.dismiss();
        Thread.sleep(5000);
        
//        Third Alert box
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
        Alert alt3 = driver.switchTo().alert();
        Thread.sleep(2000);
        alt3.sendKeys("Kavya");
        alt3.accept();
        		
        
        
        
	}

}
