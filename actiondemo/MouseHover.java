package com.bridgelabz.actiondemo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public static void mouseHover() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]"));
	    Thread.sleep(2000);
	    action.moveToElement(AreaOfExpertise).perform();
	    WebElement cloudApp = driver.findElement(By.linkText("Sign Up"));
	    Thread.sleep(2000);
	    action.moveToElement(cloudApp).click().perform();
	    driver.close();
	}

}
