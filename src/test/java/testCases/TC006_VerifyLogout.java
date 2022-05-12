package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.MyAccount_Logout;
import pageClasses.YourStore;

public class TC006_VerifyLogout extends BaseClass {

	@Test
	public void myAcc_Logout() {

		YourStore st = new YourStore(driver);
		st.doClickOnMyAccount();
		st.doClickOnbtnLogin();

		AccountLogin al = new AccountLogin(driver);
		al.enterEmailAddress();
		al.enterPassword();
		al.doLogin();

		MyAccount_Logout out = new MyAccount_Logout(driver);
		out.myAccount_Logout();

	}

}
