package seleniumpracties;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshots {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		File  hari= driver.getScreenshotAs(OutputType.FILE);
		Files .copy(hari,new File("C:\\Users\\ambal\\OneDrive\\Desktop\\screenshots\\img.png"));

	
		
	}

}
