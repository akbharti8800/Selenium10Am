package com.timekeeping.actiTime.Selenium.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	WebDriver driver;
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	@FindBy(xpath= "")
	private WebElement addNewButton;
	
	@FindBy(xpath= "")
	private WebElement newCustomerButton;
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public WebElement getAddNewButton() {
		return addNewButton;
	}
	
}
