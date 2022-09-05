package com.bridgelabz.actiondemo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownMenu {
	@Test
	public static void dropdownMenu() throws InterruptedException, AWTException{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String xp = "//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]";
        WebElement menu = driver.findElement(By.xpath(xp));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("Sign Up"));
        Thread.sleep(2000);
        submenu.click();
        driver.close();
	}

}
