package com.scrm.generic.webdriverutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOM 
{
	private WebDriver driver;

	public loginPOM(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this); // Important for @FindBy annotations
	}
	
  @FindBy(id = "user_name")
  private WebElement username;
  
  @FindBy(id = "username_password")
  private WebElement password;
  
  @FindBy(id = "bigbutton")
  private WebElement loginbutton;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginbutton() {
	return loginbutton;
}
  
}
