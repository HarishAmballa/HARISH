package seleniumpracties;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksSelenium {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ambal\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	List<WebElement>  harish=      driver.findElements(By.tagName("a"));
	System.out.println(harish.size());
	int totallinks=harish.size();
	int visiblelinks=0;
	for(int i=0;i<harish.size();i++) {
		if(harish.get(i).isDisplayed()) {
			visiblelinks++;
			
		}
  System.out.println(harish.get(i).getText());
  
	}
	System.out.println("visiblelinks"+"visiblelinks");
	System.out.println("unvisiblelinks"+(totallinks-visiblelinks));
	}

}
