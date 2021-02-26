
package Explicitwait;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.Point;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRect {
	public    WebDriver driver;
	@Test
	public void get_method()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   WebElement username = driver.findElement(By.id("email"));
	   System.out.println(username.getLocation());
	   System.out.println(username.getSize());
	   
	   //selenium version 3;
	   
	   Dimension d = username.getSize();
	   System.out.println(d.getHeight());
	   System.out.println(d.getWidth());
	   
	          Point p = username.getLocation();
			   System.out.println(p.getX());
			   System.out.println(p.getY());
			   System.out.println("##############");
			   
			// selenium version 4;   
	   
	    Rectangle r = username.getRect();
	    System.out.println( r.getHeight());
	    System.out.println( r.getWidth());
	    System.out.println(r.getX());
	    System.out.println(r.getY()) ;
		
	}
}
