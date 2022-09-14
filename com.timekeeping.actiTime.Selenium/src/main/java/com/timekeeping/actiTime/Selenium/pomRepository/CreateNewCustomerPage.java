package com.timekeeping.actiTime.Selenium.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {
	WebDriver driver;
	public CreateNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	@FindBy(xpath= "")
	private WebElement enterCustomerNameTxtField;
	
	@FindBy(xpath= "")
	private WebElement enterCustomerDescription;
	
	@FindBy(xpath= "")
	private WebElement enterCustomerDropDown;
	public WebDriver getDriver()
	{
		return driver;
	}
	
	@FindBy(xpath= "")
	private WebElement getCreateCustomerButton();
	
	
	
	
	
}
