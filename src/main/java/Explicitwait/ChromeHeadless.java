package Explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless {
	public WebDriver driver;
	@Test 
	public void headless() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
	    driver.findElement(By.id("username")).sendKeys("admin");	
		System.out.println(driver.getTitle());
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		
		
		
		
	}
	

}
