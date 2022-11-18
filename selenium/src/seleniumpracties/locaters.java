package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","C:\\Users\\ambal\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://demowebshop.tricentis.com/");
     driver.findElement(By.className("ico-register")).click();
     driver.findElement(By.id("gender-male")).click();
     driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("harish");
    
	}

}
