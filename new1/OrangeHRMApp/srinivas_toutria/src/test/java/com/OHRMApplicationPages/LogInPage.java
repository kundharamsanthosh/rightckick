package com.OHRMApplicationPages;

import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class LogInPage extends BaseTest {
	
	public  void LoginPage()
	{
	PageFactory.initElements(driver,this);	
	}
	
	@FindBy(id="logInPanelHeading");

}
