package com.Ezcontent.Automation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.BaseClass;
import Base.ResuableMethods;

public class LoginPage extends BaseClass{
	
	
	@Test
	public void loginPage() throws Exception {
		ResuableMethods.login();	

}}
