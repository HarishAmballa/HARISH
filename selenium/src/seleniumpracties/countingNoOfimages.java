package seleniumpracties;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countingNoOfimages {

	private static Object list;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambal\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

   
       List<WebElement> harish=  driver.findElements(By.tagName("img"));
       System.out.println("no.Of images"+harish.size());
       for(int i=0;i<harish.size();i++) {
    	   System.out.println(harish.get(i).getAttribute("src"));
       }
	}

}
