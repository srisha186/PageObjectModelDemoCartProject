package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Register_page extends BasePage {

	// public static WebDriver driver;

	public Register_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Register")
	public WebElement register_button;
	
	@FindBy(id = "input-firstname")
	public WebElement txtField_firstname;

	@FindBy(name = "lastname")
	public WebElement txtField_lastname;

	@FindBy(name="email")
	public WebElement txtField_email;
	
	@FindBy(name="telephone")
	public WebElement txtField_telephone;

	@FindBy(name = "password")
	public WebElement txtField_password;
	
	@FindBy(name = "confirm")
	public WebElement txtField_confirm_password;
	
	@FindBy(name = "newsletter")
	public WebElement radiobtn_newsletter;
	
	@FindBy(name = "agree")
	public WebElement chkbox_privacy;
	
	@FindBy(css = "input[value='Continue']")
	public WebElement btn_continue;


	public void doRegister(String frstName,String lastName,String email,String telephone,String pword,String confirmpwd) {
		register_button.click();
		txtField_firstname.sendKeys(frstName);
		txtField_lastname.sendKeys(lastName);
		txtField_email.sendKeys(email);
		txtField_telephone.sendKeys(telephone);
		txtField_password.sendKeys(pword);
		txtField_confirm_password.sendKeys(confirmpwd);
		radiobtn_newsletter.click();
		chkbox_privacy.click();
		btn_continue.click();
		
		
	}
	
}

/*
public void register() {
WebElement acc = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
acc.click();
Boolean value = acc.isDisplayed();
System.out.println("My Account element is Displayed " + value);
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.id("input-firstname")).sendKeys("abc");
driver.findElement(By.name("lastname")).sendKeys("sri");
driver.findElement(By.cssSelector("input#input-email")).sendKeys("abcsri70@gmail.com");
driver.findElement(By.name("telephone")).sendKeys("12345678");
driver.findElement(By.cssSelector("input[name=password]")).sendKeys("12345678");
driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("12345678");
// check radio button selected
WebElement radiobutton = driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]"));
radiobutton.click();
Boolean radio = radiobutton.isSelected();
System.out.println("RadioButton is selected: " + radio);
// verify checkbox is selected
WebElement checkbox = driver.findElement(By.cssSelector("input[name='agree']"));
checkbox.click();
Boolean check = checkbox.isSelected();
System.out.println("Checkbox is selected: " + check);
driver.findElement(By.cssSelector("input[value='Continue']")).click();
String actualTitle = "Register Account";
String expectedTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);
System.out.println("Registration title verified: " + expectedTitle);
}*/