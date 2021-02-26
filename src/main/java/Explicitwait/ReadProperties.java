package Explicitwait;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadProperties {
	public WebDriver driver;
	@Test 
	public void readValue() throws InterruptedException, IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./config.properties");
		prop.load(fis);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		driver.findElement(By.id(prop.getProperty("usernamelocation"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name(prop.getProperty("passwordnamelocator"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginlocator"))).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
	}

}
