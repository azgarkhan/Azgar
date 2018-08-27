package pages;

public class RegisterPage extends HomePage 
{
	
	public RegisterPage enterFirstName(String FirstName) throws InterruptedException
	{
		Thread.sleep(5000);
		enterByXpath(prop.getProperty("RegisterPage_enterFirstName_xpath"),FirstName);
		
		return this;
	}
	
	public RegisterPage enterLastName(String LastName) throws Exception
	{
		
		Thread.sleep(3000);
		enterByXpath(prop.getProperty("RegisterPage_enterLastName_xpath"),LastName);
		
		return this;
	}
	
	
	public RegisterPage enterPhone(String Phone) throws InterruptedException
	{
		
		Thread.sleep(3000);
		enterByXpath(prop.getProperty("RegisterPage_enterPhone_xpath"), Phone);
		return this;
	}

}
