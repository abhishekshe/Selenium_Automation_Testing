package com.bridgelabz.actiondemo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropbyOffset_Demo {
	
	@Test
	public static void dragAndDropbyOffset_Demo() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	    String xp1 = "//input[@id='email']";
	    WebElement block1 = driver.findElement(By.xpath(xp1));
	    String xp2 = "//input[@name='pass']";
	    WebElement block3 = driver.findElement(By.xpath(xp2));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(block1, block3.getLocation().getX()+5,
	    block3.getSize().getHeight()+5).perform();
	    driver.close();
		
	}

}
