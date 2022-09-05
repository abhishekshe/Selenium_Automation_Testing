package com.bridgelabz.actiondemo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo {
	
	@Test
	public static void dragAndDropDemo() throws InterruptedException, AWTException{
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String xp1 = "//input[@id='email']";
		WebElement block1 = driver.findElement(By.xpath(xp1));
		String xp2 = "//input[@name='pass']";
		WebElement block3 = driver.findElement(By.xpath(xp2));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		// drag block 1 element and drop it on block 2 element
		actions.dragAndDrop(block1, block3).perform();
		driver.close();
	}


}
