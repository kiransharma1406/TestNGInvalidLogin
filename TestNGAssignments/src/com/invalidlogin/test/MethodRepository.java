package com.invalidlogin.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodRepository {WebDriver driver;

	public void browserAppLaunch()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Palliumskills\\AutomationTesting\\Tools\\NewChrom\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
	}
	
	public void validLogin() throws InterruptedException
	{
		
		WebElement uName=driver.findElement(By.xpath("//input[@name='userName']"));
		uName.sendKeys("dasd");
		WebElement uPassword=driver.findElement(By.xpath("//input[@name='password']"));
		uPassword.sendKeys("dasd");
		WebElement uSign=driver.findElement(By.xpath("//input[@name='login']"));
		uSign.click();
		
		Thread.sleep(5000);
		
	}
	
	public boolean verifiedValidLogin()
	{
		
		String expectedtitle= "Find a Flight: Mercury Tours:";
		String actualtitle= driver.getTitle();
		
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			//System.out.println("PASS");
			return true;
		}
		else
		{
			//System.out.println("FAIL");
			return false;
		}
	}
	
	public void appClose()
	{
		
		driver.close();
		
	}
	
	public void invalidLogin() throws IOException, InterruptedException
	{
		
		WebElement uName=driver.findElement(By.name("userName"));
		
		BufferedReader b1=new BufferedReader(new FileReader("./TestNG2.properties"));
		Properties p1=new Properties();
		p1.load(b1);
		
		String username=p1.getProperty("Username");
		String userpassword=p1.getProperty("Password");
		
		uName.sendKeys(username);
		WebElement uPassword=driver.findElement(By.name("password"));
		uPassword.sendKeys(userpassword);
		
		WebElement uSign=driver.findElement(By.name("login"));
		uSign.click();
		Thread.sleep(3000);
	
	}
	
	public boolean verifiedInvalidLogin()
	{
		String expectedtitle= "Sign-on: Mercury Tours";
		String actualtitle= driver.getTitle();
		
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			//System.out.println("PASS");
			return true;
		}
		else
		{
			//System.out.println("FAIL");
			return false;
		}
	}
	
}


