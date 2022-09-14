package com.timekeeping.actiTime.Selenium.genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void bsconfig()
	{
		System.out.println("database Connectivity");
	}
	
	@BeforeClass
	public void bcConfig()
	{
		System.out.println("=========The Browser has been Launched");
		System.out.println("Navigated to the URL");
	}
	
	@BeforeMethod
	public void bmConfig()
	{
		System.out.println("=======Logged into the Application");
	}
	
	@AfterMethod
	public void amConfig()
	{
		System.out.println("=======Logged out to the Application");
	}
	
	@AfterClass
	public void acConfig()
	{
		System.out.println("========close the browser");
	}
	
	@AfterSuite
	public void asConfig()
	{
		System.out.println("=======Database has been closed==============");
	}	
}
