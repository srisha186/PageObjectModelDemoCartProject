package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class MyAccount_Logout extends BasePage {

	// public static WebDriver driver;

	public MyAccount_Logout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Logout")
	public WebElement account_logout;

	public void myAccount_Logout() {
		account_logout.click();
		String actualTitle = "Account Logout";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Logo title verified: " + expectedTitle);
		//Reporter.log("Logo title verified: "+expectedTitle);

	}

}
//		driver.findElement(By.linkText("Logout")).click();

