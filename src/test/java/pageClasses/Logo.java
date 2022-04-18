package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class Logo extends BasePage {

	// public static WebDriver driver;

	public Logo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Your Store")
	public WebElement logo;

	public void logo() {
		logo.click();
		String actualTitle = "Your Store";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Logo title verified: " + expectedTitle);
		//Reporter.log("Logo title verified: "+expectedTitle);

	}

}
