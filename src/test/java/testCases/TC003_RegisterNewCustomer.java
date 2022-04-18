package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.Register_page;
import pageClasses.YourStore;

public class TC003_RegisterNewCustomer extends BaseClass {
	
	@Test
	public <NewRegister> void doRegister() {
		YourStore st = new YourStore(driver);
		st.doClickOnMyAccount();

		Register_page cust=new Register_page(driver);
		cust.doRegister("abc", "sri", "abcsri70@gmail.com","12345678","12345678","12345678");
	
	
	}
	
}
