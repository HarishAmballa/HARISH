package seleniumpracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ambal\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.mercurytravels.co.in/");
	WebElement harish= driver.findElement(By.id("themes"));
	Select obj=new Select(harish);
	//obj.selectByIndex(4);
	//obj.selectByValue("5");
	obj.selectByVisibleText("Family");
	

	}

}
