package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;
import com.pages.HomePage;

public class LoginPage extends TestBase{
	 HomePage homepage;
	
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	
	
	//Constructor calling
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//login with username and password
	public void login(String un, String pswd) {
		
		username.sendKeys(un);
		password.sendKeys(pswd);
		loginBtn.click();
		
						
	}
	
	public String getPageTitle() {
		
		String title = driver.getTitle();
		
		return title;
	}
	
	

}
