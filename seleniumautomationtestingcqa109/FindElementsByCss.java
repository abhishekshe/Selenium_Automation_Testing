package com.bridgelabz.seleniumautomationtestingcqa109;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsByCss {
	
	
	@Test
	public static void findElementsByCSS() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Abhishek");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Narwariya");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("abhisheknarwariya813@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("abhisheknarwariya813@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Abhishek@123");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("select[name='birthday_day']")).sendKeys("28");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("select[name='birthday_month']")).sendKeys("April");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("select[name='birthday_year']")).sendKeys("1998");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[name='websubmit']")).click();
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void logInCreditionalsByXcss() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abhisheknarwariya813@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Abhishek@123");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[name='login']")).click();
        Thread.sleep(2000);
        driver.close();
    }
		
	

}
