package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.OpentapsWrappers;

public class TC001_CreateRegister extends OpentapsWrappers
{
  @Test(dataProvider="fetchData")
  public void CreateRegister(String FirstName, String LastName) throws InterruptedException, Exception 
  {
	 new HomePage()
	 .clickRegisterLink()
	 .enterFirstName(FirstName)
	 .enterLastName(LastName);
		  
	  
  }

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Create a register with first name and last name";
		testDescription="Create a register with first name and last name";
	}


}
