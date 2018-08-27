package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.OpentapsWrappers;

public class TC003_LoginValidation extends OpentapsWrappers{
  @Test(dataProvider="fetchData")
  public void LoginValidation(String userName, String password) throws Exception 
  {
	  new HomePage()
	  .enterUserName(userName)
	  .enterPassword(password)
	  .clickSignINButton();
	  
	  
  }
		@BeforeClass
		public void beforeClass() {
			dataSheetName="TC003";
			browserName="chrome";
			testCaseName="Verify user able to login";
			testDescription="Create a register with phone number";
		}

  }
  
  
  

