package pageClasses;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class PurchaseItem_HomePage extends BasePage {


	public PurchaseItem_HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = "//a[text()='Desktops']")
	public WebElement btn_desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	public WebElement show_all_desktops;
	
	@FindBy(xpath = "//a[contains(text(),'Apple Cinema')]")
	public WebElement apple_Cinema;
	
	@FindBy(xpath = "(//input[@name='option[223][]'])[1]")
	public WebElement chkbox_applecinema;
	
	@FindBy(css = "input[id='input-option208']")
	public WebElement txtfield_applecinema;
	
	@FindBy(id = "input-option217")
	public WebElement dropdown_applecinema;
	
	@FindBy(xpath = "//div[@class='input-group date']//i[@class='fa fa-calendar']")
	public WebElement dateicon_applecinema;
	
	@FindBy(xpath = "(//th[@class='picker-switch'])[1]")
	public WebElement monthval;

	@FindBy(xpath = "(//th[@class='next'])[1]")
	public WebElement desired_monthdateval;


	@FindBy(className = "day")
	public List<WebElement> totdays;
	
	public void desktops() {
		Actions action = new Actions(driver);
		action.moveToElement(btn_desktops).click().build().perform();
		action.moveToElement(show_all_desktops).click().build().perform();
		action.moveToElement(apple_Cinema).click().build().perform();

	}
	public void checkbox_Applecinema() {
		chkbox_applecinema.click();
		System.out.println("Check wether the check box selected " +chkbox_applecinema.isSelected());
		txtfield_applecinema.clear();
		txtfield_applecinema.sendKeys("Sri");
	}
	public void dropdown_applecinema(){
		dropdown_applecinema.click();
		Select color = new Select(dropdown_applecinema);
		color.selectByIndex(1);
		System.out.println("The size is" + color.getOptions().size());

	}
	public void date_applecinema() {
		dateicon_applecinema.click();
		while (!monthval.getText().contains("June 2020")) {
			desired_monthdateval.click();
		}
		for (int i = 0; i < totdays.size() ; i++) {
			// get the numbers and store it in String
			String selDate = totdays.get(i).getText();
			if (selDate.equals("18")) {
				totdays.get(i).click();
				System.out.println(selDate);
				break;
			}

			}

		
		
	}

}
/*public void purchaseDesktop() {
// Select checkbox
// Date icon
driver.findElement(By.xpath("//div[@class='input-group date']//i[@class='fa fa-calendar']")).click();
WebElement monthVal = driver.findElement(By.xpath("(//th[@class='picker-switch'])[1]"));
// monthVal.getText();

while (!monthVal.getText().contains("June 2020")) {
	// click arrow until you reach desire month and year
	driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
}
// select a common element and get the size
List<WebElement> dateValue = driver.findElements(By.className("day"));
int count = dateValue.size();

for (int i = 0; i < count; i++) {
	// get the numbers and store it in String
	String selDate = dateValue.get(i).getText();
	if (selDate.equals("18")) {
		dateValue.get(i).click();
		System.out.println(selDate);
		break;

	}

}
}
// div[@class='bootstrap-datetimepicker-widget dropdown-menu top pull-right
// picker-open']

// select Date Form
/*
 * driver.findElement(By.xpath("//label[@for='input-option219']")).click();
 * //Select Calender Icon
 * driver.findElement(By.xpath("(//i[@class='fa fa-calendar'])[1]")).click();
 * //Click next arrow
 * driver.findElement(By.xpath("(//th[@class='next'])[1]")).click(); //select
 * month
 * driver.findElement(By.xpath("(//th[@class='picker-switch'])[1]")).click();
 * //select current date
 * driver.findElement(By.xpath("(//td[@class='day active'])[1]")).click();
 */

// driver.findElement(By.xpath("//th[text()='April 2022']")).click();*/
