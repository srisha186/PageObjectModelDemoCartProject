package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.Currency_Homepage;

public class TC004_CurrencyList extends BaseClass {
	
	@Test
	public void homepage_currency(){
		Currency_Homepage<Object> cur=new Currency_Homepage<Object>(driver);
		cur.currency();
		

	}
	
}
