package com.bridgelabz.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaysofClickingonaButton {
	
	@Test
	public static void diffwaysofClickingonaButton(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String xp = "//button[contains(@name,'login')]";
        driver.findElement(By.xpath(xp)).click();
        driver.close();
    }

	@Test	
	public static void diffwaysofClickingonaButton1() {

        System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String xp = "//button[contains(@name,'login')]";
        driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
        driver.close();
        
	}
	
	@Test
    public static void diffwaysofClickingonaButton2() {

	    System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String xp = "//button[contains(@name,'login')]";
        driver.findElement(By.xpath(xp)).submit();
	    driver.close();
    }
        
     
		

}
