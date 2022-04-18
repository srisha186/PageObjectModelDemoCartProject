package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage2 {
	 protected static WebDriver driver;

	public BasePage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public class BasePage {

		private WebDriver driver;

		public BasePage(WebDriver driver) {
			 this.driver=driver;
		        PageFactory.initElements(this.driver, this);	}


	}

}
