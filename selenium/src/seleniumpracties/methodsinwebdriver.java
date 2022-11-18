package seleniumpracties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class methodsinwebdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambal\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn2")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@id='txt2'])[1]")));
		
		driver.findElement(By.xpath("(//input[@id='txt2' and @type='text'])[1]")).sendKeys("harish");
		
		

	}

}
