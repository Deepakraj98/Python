package com.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoUserName extends BaseClass {
	
	public PojoUserName() {
	
	PageFactory.initElements(driver,this);
	
	}
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@type='text']"),
		@FindBy(xpath="//input[@name='username']"),
		@FindBy(xpath="//input[@id='username']")
		
	})
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	
	@FindAll({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@name='password']"),
		@FindBy(xpath="//input[@id='password']")
	})
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	}


