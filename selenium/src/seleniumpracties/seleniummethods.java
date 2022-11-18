package seleniumpracties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniummethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambal\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://flipkart.com/");
		Thread.sleep(3000);
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getWindowHandles());
		driver.close();
		driver.quit();
		
	}
}
