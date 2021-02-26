package com.page.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FacebookLoginPage {
	 public WebDriver driver;
	 
	 @FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	 private WebElement loginText;
	 
	 @FindBy(xpath="//div[@class='o6cuMc']")
     private WebElement login;
	 
	 
		
 public FacebookLoginPage(WebDriver driver)
	 { 
			   PageFactory.initElements(driver, this);
	 }
	 
 public void loginMethod()
	 {
		 loginText.click();
		// Reporter.log("gggiii",true);
		 
	 }
 public void loginPage()
 {
	 String exxpt = login.getText();
	 String aual = "Enter an email or phone number";
	 Assert.assertEquals(exxpt, aual);
	//Reporter.log(login.getText(),true);
 }



}
