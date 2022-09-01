package com.bridgelabz.seleniumautomationtestingcqa109;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFileDemo {
	
	@Test
	public static void DownloadFileDemo() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[normalize-space()='4.4.0']")).click();
		driver.close();
	
		}

}
