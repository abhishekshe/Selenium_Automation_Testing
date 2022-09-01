package com.bridgelabz.javaexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javaexcecuter {
	
	@Test
	public static void javaexcecuter() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abhis/OneDrive/Documents/DisabledTextBook.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('t2').value=''");
	
		js.executeScript("document.getElementById('t2').value='manager'");
		
		js.executeScript("document.getElementById('t2').type='button'");
	}

}
