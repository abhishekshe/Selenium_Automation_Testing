package com.bridgelabz.seleniumautomationtestingcqa109;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationCountTag {
	
	@Test
	public static void CountTag() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int totalLinks = allLinks.size();
		System.out.println("total no. of links" + totalLinks);
		
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		
		for (WebElement link : allLinks)
		{
			if(link.isDisplayed())
			{
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "--" + link.getText());		
			}
			else
			{
				hiddenLinkCount++;
						
				
				
			}
			System.out.println("total no. of visibleLink" + visibleLinkCount);
			System.out.println("total no. of hiddenLink" + hiddenLinkCount);
			
			driver.close();
		}
		
		
		
		
	}
	
	@Test
	
	public static void CountInputTag() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("input"));
		
		int totalLinks = allLinks.size();
		System.out.println("total no. of links" + totalLinks);
		
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		
		for (WebElement link : allLinks)
		{
			if(link.isDisplayed())
			{
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "--" + link.getText());		
			}
			else
			{
				hiddenLinkCount++;
						
				
				
			}
			System.out.println("total no. of visibleLink" + visibleLinkCount);
			System.out.println("total no. of hiddenLink" + hiddenLinkCount);
			
			driver.close();
		}
		
		
		
		
	}
	
	@Test
	public static void CountdivTag() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("div"));
		
		int totalLinks = allLinks.size();
		System.out.println("total no. of links" + totalLinks);
		
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		
		for (WebElement link : allLinks)
		{
			if(link.isDisplayed())
			{
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "--" + link.getText());		
			}
			else
			{
				hiddenLinkCount++;
						
				
				
			}
			System.out.println("total no. of visibleLink" + visibleLinkCount);
			System.out.println("total no. of hiddenLink" + hiddenLinkCount);
			
			driver.close();
		}
			
	}
	@Test
	
	public static void CountStyleTag() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("style"));
		
		int totalLinks = allLinks.size();
		System.out.println("total no. of links" + totalLinks);
		
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		
		for (WebElement link : allLinks)
		{
			if(link.isDisplayed())
			{
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "--" + link.getText());		
			}
			else
			{
				hiddenLinkCount++;
						
				
				
			}
			System.out.println("total no. of visibleLink" + visibleLinkCount);
			System.out.println("total no. of hiddenLink" + hiddenLinkCount);
			
			driver.close();
		}
			
	}
	@Test
	
	public static void CountScriptTag() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("script"));
		
		int totalLinks = allLinks.size();
		System.out.println("total no. of links" + totalLinks);
		
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		
		for (WebElement link : allLinks)
		{
			if(link.isDisplayed())
			{
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "--" + link.getText());		
			}
			else
			{
				hiddenLinkCount++;
						
				
				
			}
			System.out.println("total no. of visibleLink" + visibleLinkCount);
			System.out.println("total no. of hiddenLink" + hiddenLinkCount);
			
			driver.close();
		}
			
	}

}
