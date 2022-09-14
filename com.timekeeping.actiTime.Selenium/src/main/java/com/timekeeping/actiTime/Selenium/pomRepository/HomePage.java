package com.timekeeping.actiTime.Selenium.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	@FindBy(id= "logoutLink")
	private WebElement logoutLink;
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public WebElement TaskButton()
	{
		return taskButton;
	}
	
	public WebElement LogoutLink()
	{
		return LogoutLink;
	}
	public WebElement clickOntaskButton()
	{
		taskButton.click
	}
	
}
