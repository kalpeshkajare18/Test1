package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement menuBtn;
	
	@FindBy(id = "about_sidebar_link")
	WebElement aboutBtn;
	
	//Constructor Calling
	
public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

// click on menu
 public void clickMenu() {
	 
	 menuBtn.click();
 }
 
 //click on About Menu
 
 public void clickOnAbout( ) {
	 
	 aboutBtn.click();
 }

 // validate url
 
 public String validateURL( ) {
	 
	 String url = driver.getCurrentUrl();
	 
	 return url;
	 
 }
 
 //back to home product page
 
 public String backtoProductPage( ) throws InterruptedException {
	 
	 Thread.sleep(5000);
	 driver.navigate().back();
	 
	 String urlProductPage = driver.getCurrentUrl();
	 
	 return urlProductPage;
 }
 
 
 
 
}
