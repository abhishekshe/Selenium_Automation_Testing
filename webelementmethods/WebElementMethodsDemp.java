package com.bridgelabz.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebElementMethodsDemp {
	
	@Test
	public static void webElementMethodsDemp(){
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement unTB = driver.findElement(By.id("email"));
		int username_width = unTB.getSize().getWidth();
		int username_height = unTB.getSize().getHeight();
		
		 System.out.println("Username field Hieght : "+username_height);
	     System.out.println("Username field Width :"+username_width);
		WebElement pwTB = driver.findElement(By.name("pass"));
		int password_width = pwTB.getSize().getWidth();
		int password_height = pwTB.getSize().getHeight();
		if (username_height == password_height && username_width==password_width && username_height==password_height) {
		System.out.println("Username and password text box are aligned");
		} else {
		System.out.println("Username and password text box are NOT aligned");
		}
		driver.close();
	}
}
