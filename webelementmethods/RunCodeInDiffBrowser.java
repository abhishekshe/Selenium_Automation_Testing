package com.bridgelabz.webelementmethods;

import java.awt.AWTException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class RunCodeInDiffBrowser {
	
    @Test
    public void runcodeInDiffBrowser() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For Chrome browser press 1");
        System.out.println("For firefox browser press 2");
         System.out.println("For Internet Explorer browser press 3");
        System.out.println("Enter your choice : ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
            	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        		
        		WebDriver driver1 = new ChromeDriver();
                driver1.get("https://www.facebook.com/");
                driver1.manage().window().maximize();
                driver1.findElement(By.name("email")).sendKeys("abhisheknarwariya813@gmail.com");
                Thread.sleep(2000);
                driver1.findElement(By.name("pass")).sendKeys("Abhi@123");
                Thread.sleep(2000);
                driver1.findElement(By.name("login")).click();
                Thread.sleep(2000);
                driver1.close();
                break;
            case 2:
            	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        		
        		WebDriver driver2 = new FirefoxDriver();
                driver2.get("https://www.facebook.com/");
                driver2.manage().window().maximize();
                driver2.findElement(By.name("email")).sendKeys("abhisheknarwariya813@gmail.com");
                Thread.sleep(2000);
                driver2.findElement(By.name("pass")).sendKeys("Abhi@123");
                Thread.sleep(2000);
                driver2.findElement(By.name("login")).click();
                Thread.sleep(2000);
                driver2.close();
                break;
            case 3:
                System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
                WebDriver driver3 = new InternetExplorerDriver();
                
                driver3.get("https://www.facebook.com/");
                driver3.manage().window().maximize();
                driver3.findElement(By.name("email")).sendKeys("abhisheknarwariya813@gmail.com");
                Thread.sleep(2000);
                driver3.findElement(By.name("pass")).sendKeys("Abhi@123");
                Thread.sleep(2000);
                driver3.findElement(By.name("login")).click();
                Thread.sleep(2000);
                driver3.close();
                break;
            default:
                System.out.println("Selected number is not valid");
                break;
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	RunCodeInDiffBrowser run = new RunCodeInDiffBrowser();
        run.runcodeInDiffBrowser();
    }
	
}
