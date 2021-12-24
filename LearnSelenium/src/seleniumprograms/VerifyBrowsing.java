package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrowsing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String actualUrl="http://demowebshop.tricentis.com/";

//		Get page Title
		String pageTitle=driver.getTitle();
		System.out.println("PageTitle:"+pageTitle);
//		print length of page title	
		int length=pageTitle.length();
		System.out.println("Title Length:"+length);
		
//		Get page url
		String pageUrl=driver.getCurrentUrl();
	
		System.out.println("Page url:"+pageUrl);
		if(actualUrl.equals(pageUrl)) {
			System.out.println("You are on the correct page");
		}
		else {
			System.out.println("You are on the wrong page");
		}

//		Get source code
		String source=driver.getPageSource();
		System.out.println("Source code"+source);
		int sourcecodeLength = source.length();
		System.out.println("Source code length:"+sourcecodeLength);
		driver.close();
	}

}
