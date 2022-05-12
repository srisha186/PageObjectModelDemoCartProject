package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.WishList;
import pageClasses.YourStore;

public class TC007_VerifyWishList extends BaseClass {

	@Test
	public void myAcc_Logout() throws InterruptedException {

		YourStore st = new YourStore(driver);
		st.doClickOnMyAccount();
		st.doClickOnbtnLogin();

		AccountLogin al=new AccountLogin(driver);
		al.enterEmailAddress();
		al.enterPassword();
		al.doLogin();
		
		WishList items=new WishList(driver);
		items.wishlist_item();
		

	}

}
