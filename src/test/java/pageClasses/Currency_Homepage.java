package pageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Currency_Homepage<WebElements> extends BasePage {

	// public static WebDriver driver;

	public Currency_Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@data-toggle='dropdown']//span[@class='hidden-xs hidden-sm hidden-md']")
	public WebElement btn_currency;

	@FindBy(xpath = "//button[@class='currency-select btn btn-link btn-block']")
	public List<WebElement> totnum_Currency;

	public void currency() {
		btn_currency.click();

		System.out.println("The total number of currency is :" + totnum_Currency.size());

		for (int i = 0; i < totnum_Currency.size(); i++) {

			String currency = totnum_Currency.get(i).getAttribute("name");
			if (currency.equals("EUR")) {
				totnum_Currency.get(i).click();
				System.out.println("The selected currency is " + currency);
				break;

			}

		}
	}
}
/*
 * List<WebElement> totalCurrency = driver.findElements(By.xpath());
 * 
 * }
 * 
 * }
 */
