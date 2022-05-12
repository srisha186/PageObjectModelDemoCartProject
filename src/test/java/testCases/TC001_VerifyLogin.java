package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.YourStore;

public class TC001_VerifyLogin extends BaseClass {
	
	
	@Test(description="Verify Login")
	public void verifyLogin() {
		
	YourStore st = new YourStore(driver);
	st.doClickOnMyAccount();
	st.doClickOnbtnLogin();
	
	AccountLogin al=new AccountLogin(driver);
	//al.enterEmailAddress();
	//al.enterPassword();
	//al.doLogin();
	al.doLogin2("abcsri70@gmail.com","abc@sri123");

	}
	
	
	
}
