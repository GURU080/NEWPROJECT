package com.activetime.customers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.activetime.baseclass.Base;

public class Delet extends Base{
	 @Test
	public void Testdeletecustomer()  {
		 driver.findElement(By.xpath("//div[@id=\"container_tasks\"]")).click();
	WebElement se=	 driver.findElement(By.xpath("(//input[@placeholder=\"Start typing name ...\"])[1]"));
	se.sendKeys("mahi");
	
		 
		 
	  WebElement ee= driver.findElement(By.xpath("(//span[text()='mahi']/../../..//div[@class=\"editButton\"])[1]"));
	  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
      jsExecutor.executeScript("arguments[0].click();", ee);
	 
	    
	//	Actions act=new Actions(driver);
		 
		
		 
		
		
		 driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
		 driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
		 driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		 
	  }

	private JavascriptExecutor JavascriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
}
