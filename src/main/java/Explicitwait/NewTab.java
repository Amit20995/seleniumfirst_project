package Explicitwait;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab {
	public WebDriver driver;
@Test 
public void tabOne() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	//WebElement tab1 = (WebElement) driver.switchTo().newWindow(WindowType.TAB);
	 driver.switchTo().newWindow(WindowType.WINDOW);
	
}
}
