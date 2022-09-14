package com.timekeeping.actiTime.Selenium.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	constructor which will load all the findBy during object creation 
	WebDriver driver;
	public   void Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
//	identifying all the elements
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath= "//div[text()='Login ']")
	private WebElement loginButton;
	
//	Getter Methods 
	public WebElement getusernameTextField()
	{
		return usernameTextField;
	}
	
	public WebElement getpasswordTextField()
	{
		return passwordTextField;
	}
	
	public WebElement getloginButton()
	{
		return loginButton;
	}	

	public void loginAction(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

}
