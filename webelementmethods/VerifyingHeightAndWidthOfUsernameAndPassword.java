package com.bridgelabz.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyingHeightAndWidthOfUsernameAndPassword {
	
	@Test
	public static void VerifyActime_UNandPassword_HeightandWidth(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement unTB = driver.findElement(By.id("email"));
		
		int username_height = unTB.getSize().getHeight();
		
		int username_width = unTB.getSize().getWidth();
		System.out.println("Username field Ht : "+username_height);
		System.out.println("Username field Wd"+username_width);
	
		WebElement pwdTB = driver.findElement(By.name("pass"));
		
		int password_height = pwdTB.getSize().getHeight();
		
		int password_width = pwdTB.getSize().getWidth();
		System.out.println("Password field height : "+password_height);
		System.out.println("Password field width : "+password_width);
        if (username_height==password_height && username_width==password_width) {
		    System.out.println("User name and password fields are aligned");
		}
        else
        {
		    System.out.println("Username and password fields are NOT aligned");
		}
		driver.close();
	}

}
