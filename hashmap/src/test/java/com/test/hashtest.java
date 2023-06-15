package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import com.hashmapmain.hashmapImplementation;

public class hashtest  {
	public WebDriver driver;
	
	public String collect[];	
	
	
	@BeforeMethod
	public void launch()
	{

		System.setProperty("webdriver.chrome.driver", "A:\\crm\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
	}
	
	@Test(priority =1)
	public void Sample1()
	{
		String one = hashmapImplementation.credentialHash().get("customer");
		collect =one.split("_");
		
		driver.findElement(By.name("username")).sendKeys(collect[0]);
		driver.findElement(By.name("password")).sendKeys(collect[1]);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.switchTo().frame("mainpanel");
		Select jk = new Select(driver.findElement(By.name("slctMonth")));
		String month = hashmapImplementation.months().get(1);
		System.out.println(month);
		
		jk.selectByVisibleText(month);
		
	}



}
