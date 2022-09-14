package com.timekeeping.actiTime.Selenium.basicProgram;

import org.testng.annotations.Test;

public class GroupExcution {

	
	@Test (groups= "Smoke")
	public void logIn()
	{
		System.out.println("Login");
	}
	
	@Test
	public void selectProduct()
	{
		System.out.println("selectProduct");
	}
	
	@Test	(groups= "Smoke")
	public void logOut()
	{
		System.out.println("logOut");
	}
}
