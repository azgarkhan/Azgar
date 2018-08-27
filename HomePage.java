package pages;

import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers
{
	public HomePage enterUserName(String userName)
	{
		enterByXpath(prop.getProperty("HomePage_enterUserName_xpath"), userName);
		return  this;
	}
	
	public HomePage enterPassword(String password)
	{
		enterByName(prop.getProperty("HomePage_enterPassword_name"), password);
		
		
		return this;
	}
	
	public HomePage clickSignINButton()
	{
		clickByXpath(prop.getProperty("HomePage_ClickLogin_xpath"));
		return this;
	}
	
	public RegisterPage clickRegisterLink()
	{
		
		clickByLink(prop.getProperty("HomePage_clickRegisterLink.link"));
		return new RegisterPage();
	}

}
