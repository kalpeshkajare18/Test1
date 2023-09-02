package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.testbase.TestBase;



public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	//constructor calling
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeTest
	public void setup() {
		
		setupDriver();
		loginpage = new LoginPage();
		
		}
	
  @Test
  public void loginTest() {
	  
	  loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	  
	  String title = loginpage.getPageTitle();
	  Assert.assertEquals(title, "Swag Labs");
	  	  
	  
  }
  
  
  
  
}
