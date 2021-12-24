package seleniumprograms;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyRegistration {

	public static void main(String[] args) {
//		set up the webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		List<WebElement> monthcount;
		List<WebElement> yearcount;
		List<WebElement> daycount;
		ListIterator<WebElement> yearlist;
		ListIterator<WebElement> monthlist;
		ListIterator<WebElement> daylist;
		
//		Get year values from the page
		
		WebElement year = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select yer = new Select(year);
		
		yearcount=yer.getOptions();
        System.out.println(yearcount.size());
        yearlist = yearcount.listIterator();
        System.out.println("---Year list---");
        while(yearlist.hasNext()) {
        	System.out.println(yearlist.next().getText());
        }
//        set year value
        yer.selectByValue("1999");
        
//		get month values
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
        Select mth=new Select(month);
        
        monthcount=mth.getOptions();
        System.out.println(monthcount.size());
        monthlist = monthcount.listIterator();
        System.out.println("---Month list---");
        while(monthlist.hasNext()) {	
        	System.out.println(monthlist.next().getText());
        }
//        another way to display content
//        for(int i=0;i<monthcount.size();i++)
//        {
//            System.out.println(monthcount.get(i).getText());
//        }
        
//        set month value
        mth.selectByIndex(9);
        
        
//		Get days from the page
		
		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select dayselect = new Select(day);
		
		daycount=dayselect.getOptions();
        System.out.println(daycount.size());
        daylist = daycount.listIterator();
        System.out.println("----Day list----");
        while(daylist.hasNext()) {
        	
        	System.out.println(daylist.next().getText());
        }
//        set day value
        dayselect.selectByVisibleText("6");
		
	}

}
