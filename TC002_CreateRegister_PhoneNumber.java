package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.OpentapsWrappers;

public class TC002_CreateRegister_PhoneNumber extends OpentapsWrappers{
  @Test(dataProvider="fetchData")
  public void CreateRegister_PhoneNumber(String FirstName, String LastName, String Phone) throws Exception 
  {
	  new HomePage()
	  .clickRegisterLink()
	  .enterFirstName(FirstName)
	  .enterLastName(LastName)
	  .enterPhone(Phone);
	  
  }
		@BeforeClass
		public void beforeClass() {
			dataSheetName="TC002";
			browserName="chrome";
			testCaseName="Create a register with phone";
			testDescription="Create a register with phone number";
		}

  }
  
  
  

