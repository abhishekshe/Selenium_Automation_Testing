package com.bridgelabz.webelementmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterTextIntoTextField {
	
	@Test
	public static void enterTextIntoTextField(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 driver.switchTo().activeElement().sendKeys("admin");
	     driver.close();
	}

}
