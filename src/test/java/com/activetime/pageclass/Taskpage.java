package com.activetime.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Taskpage {
	
	@FindBy(xpath="//div[@id=\\\"container_tasks\\\"]")
	WebElement Tasktab;
	
	@FindBy(xpath="//div[text()='Add New']")
	WebElement addnewbutton;
	
	
	
	public void clickontasks(WebDriver driver) {
		Tasktab.click();
	}
     
	public void clickonADDNEW(WebDriver driver) {
		 addnewbutton.click();
	}
}
