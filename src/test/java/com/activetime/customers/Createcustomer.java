package com.activetime.customers;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.activetime.baseclass.Base;
import com.activetime.pageclass.Taskpage;

public class Createcustomer extends Base {
  @Test
  public void TestCreatecustomer() throws IOException, Throwable {
	
	  tp.clickontasks(driver);
	  
	  tp.clickonADDNEW(driver);
	 
	  driver.findElement(By.xpath("//div[@class=\"item createNewCustomer\"]")).click();
	  
	  String cn= exl.getExcelData("customer", 1, 0);
	  System.out.println(cn);
	  String dn= exl.getExcelData("customer", 1, 1);
	  System.out.println(dn);
	  driver.findElement(By.xpath("(//input[@placeholder=\"Enter Customer Name\"])[2]")).sendKeys(cn);
	  driver.findElement(By.xpath("//textarea[@placeholder=\"Enter Customer Description\"]")).sendKeys(dn);
	  driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	  
	  
  }
}
