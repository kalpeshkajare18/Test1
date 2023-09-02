package com.tests;

import org.testng.annotations.Test;

import com.pages.HomePage;

import com.testbase.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class HomePageTest extends TestBase{
	
	

	HomePage homepage;
	
	//constructor calling
	
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		
		
		homepage = new HomePage();
		
		}
	
  @Test
  public void homePageTest() {
	  
	  homepage.clickMenu();
	  homepage.clickOnAbout();
  }
  
  public void validateURLTest() {
	  
	  String url = homepage.validateURL();
	  Assert.assertEquals(url, prop.getProperty("url"));
  }
  
  
  public void validateProductURL( ) throws InterruptedException {
	  
	  String productPageURL = homepage.backtoProductPage();
	  Assert.assertEquals(productPageURL, "https://www.saucedemo.com/inventory.html");
  }
  
  @AfterTest
  public void tearDown() {
	  
	  closeBrowser();
  }
 
  

}
