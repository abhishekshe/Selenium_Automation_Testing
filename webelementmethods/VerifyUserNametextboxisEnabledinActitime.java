package com.bridgelabz.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyUserNametextboxisEnabledinActitime {
	@Test
	public static void VarifyUserNametextboxisEnabledinActitime() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement UN = driver.findElement(By.id("email"));
        if (UN.isEnabled()) {
            System.out.println("Username text box is enabled");
        }else {
            System.out.println("Username text box is disabled");
        }
        driver.close();
	}

}
