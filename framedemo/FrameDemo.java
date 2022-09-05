package com.bridgelabz.framedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameDemo {
	
	@Test
	public static void frameDemo() throws InterruptedException{
       System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/abhis/OneDrive/Documents/page2.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("a");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("t2")).sendKeys("a");
		Thread.sleep(3000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("b");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(3000);
		//using name attribute of the frame -string
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("c");
		Thread.sleep(3000);
		WebElement f = driver.findElement(By.className("c1"));
		Thread.sleep(3000);
		driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("d");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(3000);
		driver.close();
		
	}

}
