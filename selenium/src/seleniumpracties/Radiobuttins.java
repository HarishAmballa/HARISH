package seleniumpracties;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttins {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambal\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
         List<WebElement> harish= driver.findElements(By.xpath("//input[@type='radio']"));
         int total=harish.size();
         int visible=0;
         for(int i=0;i<harish.size();i++) {
        	 if (harish.get(i).isSelected());
        	 {
        		 visible++;
        		 System.out.println("selectedlinks"+visible);
        	 }
         }
         }
	}


