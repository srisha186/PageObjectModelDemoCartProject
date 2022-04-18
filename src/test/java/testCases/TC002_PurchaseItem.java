package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.PurchaseItem_HomePage;

public class TC002_PurchaseItem extends BaseClass {
	
	@Test
	public void purchase_Item() {
		PurchaseItem_HomePage item= new PurchaseItem_HomePage(driver);
		item.desktops();
		item.checkbox_Applecinema();
		item.dropdown_applecinema();
		item.date_applecinema();
	
	}
	
}
