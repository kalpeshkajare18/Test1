package com.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		try{
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C://Users/kkajare/eclipse-workspace/KalpeshKajare/src/main/java/" +"com/config/config.properties");
		prop.load(fis);
		
		}
	catch(Exception e) {
		
		System.out.println("File not found");
		
	}		
		
	}
	
	public void setupDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkajare\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	

}

