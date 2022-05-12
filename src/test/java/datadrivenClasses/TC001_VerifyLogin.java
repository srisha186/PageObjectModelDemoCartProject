package datadrivenClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.YourStore;

public class TC001_VerifyLogin extends BaseClass {
	
	
	@Test(dataProvider="dataValue")
	public void verifyLogin(String email_address,String password) {
		
	YourStore st = new YourStore(driver);
	st.doClickOnMyAccount();
	st.doClickOnbtnLogin();
	
	AccountLogin al=new AccountLogin(driver);
	al.doLogin2(email_address,password);
	}
	
	
	@DataProvider(name="dataValue")
	public Object[][] passdata(){
		//create 2D array name data with 3 rows and 2 column
		Object[][] data = new Object[4][2];
		//we have input data 	
		data[0][0]="sdsds@gmail.com";
		data[0][1]="abc@sri123";
		
		data[1][0]="abcsri70@gmail.com";
		data[1][1]="fdfdf@sri123";	
		
		data[2][0]="sbsjs@gmail.com";
		data[2][1]="fddghjmju";
		
		data[3][0] = "abcsri70@gmail.com" ;
		data[3][1] = "abc@sri123";
		return data;
		
	}	
	
}
