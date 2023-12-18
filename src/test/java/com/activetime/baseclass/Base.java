package com.activetime.baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.activetime.pageclass.Taskpage;

public class Base {
	
	 public WebDriver driver;
	 public Excellibray exl;
	 public Taskpage tp;
	 
  @BeforeClass
  public void openbrowser() throws IOException, Throwable {
	  
	  tp=new Taskpage();
	  exl=new Excellibray();
	 
	   String bn=exl.getExcelData("Browser", 1, 0);
	   if(bn.equals("Chrome")) {
		   driver=new ChromeDriver();
		  }
	   else if(bn.equals("Firefox")) {
		   System.out.println("firefox");
	   }
	   
	  driver.get("https://online.actitime.com/gmm/login.do");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  String exptitle="actiTIME - Login";
	  System.out.println(exptitle);
	  String acttitle=driver.getTitle();
	  System.out.println(acttitle);
	  Assert.assertEquals(exptitle, acttitle);
  }
  
  @BeforeMethod
  public void login() throws Exception, Throwable {
	  
	 
	 String un= exl.getExcelData("Login", 1, 0);
	 String pw=  exl.getExcelData("Login", 1, 1);
	  
	  driver.findElement(By.id("username")).sendKeys(un);
	  driver.findElement(By.name("pwd")).sendKeys("Ntr@098765");
	  driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
	  
	  String exptitle1="Enter Time-Track for";
	  System.out.println(exptitle1);
	  String acttitle1=driver.findElement(By.xpath("//h3[text()='Enter Time-Track for']")).getText();
	  System.out.println(acttitle1);
	  Assert.assertEquals(exptitle1, acttitle1);
	  
	  
	  
  }
  
  @AfterMethod
  public void logout() throws InterruptedException {
	  
	 driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();
	  
	 
		}
  
  
  @AfterClass
  public void closebrowser() {
	  
	  driver.quit();
  }
  
}
