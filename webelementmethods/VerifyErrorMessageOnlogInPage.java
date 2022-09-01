package com.bridgelabz.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyErrorMessageOnlogInPage {
	
	@Test
	public static void varifyErrorMessageOnlogInPage() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("login")).click();
        WebElement errMsg = driver.findElement(By.xpath("//div[contains(@class,'_9ay7')]"));
        String errtext = errMsg.getText();
        System.out.println("error message is :" + errtext);
        driver.close();
	}

}
