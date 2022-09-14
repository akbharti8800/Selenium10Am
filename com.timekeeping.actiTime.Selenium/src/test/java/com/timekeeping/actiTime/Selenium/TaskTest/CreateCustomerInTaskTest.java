package com.timekeeping.actiTime.Selenium.TaskTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.timekeeping.actiTime.Selenium.pomRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;




public class CreateCustomerInTaskTest {
	
	@Test
	
	public void createCustomerTest() throws IOException
	{
	FileInputStream	fis =new FileInputStream("./src/test/resources/testData/MavenTestdata.xlsx");
	Properties property = new Properties();
	property.load(fis);
	String URL =property.getProperty("URL");
	String username = property.getProperty("username");
	String password =property.getProperty("password");
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(URL);
	

	LoginPage login = new LoginPage();
	login.loginAction(username, password);
	} 
}
