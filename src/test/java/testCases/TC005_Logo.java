package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.Logo;

public class TC005_Logo extends BaseClass {
	
	@Test
	public void verifyLogo() {
		
	Logo lo=new Logo(driver);
	lo.logo();	
	
	}
	
}
