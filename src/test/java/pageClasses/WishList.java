package pageClasses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class WishList extends BasePage {
	public JavascriptExecutor js;

	// public static WebDriver driver;

	public WishList(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	public WebElement btn_desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	public WebElement show_all_desktops;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[2]/i[1]")
	public WebElement item1_wishlist;
	
	@FindBy(xpath="//span[contains(text(),'Wish List')]")
	public WebElement btn_wishList;
	
	@FindBy(className=".table-responsive")
	public List<WebElement> totalitems_wishList;
	
	
	public void wishlist_item() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(btn_desktops).click().build().perform();
		action.moveToElement(show_all_desktops).click().build().perform();
		
		Thread.sleep(3000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900);");
		item1_wishlist.click();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -900);");
		btn_wishList.click();	
		
		Thread.sleep(3000);
		String actualTitle = "My Wish List";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("WishList title verified: " + expectedTitle);

		
	
	}
	
	
	/*
//total no of wish list is 12 in purchase desktop
	@FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
	public List<WebElement> btn_wishList;
	
	

	public void wishList() {
		//iphone wish list
		//btn_wishList.add("/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[5] //button[@data-original-title='Add to Wish List']")
		System.out.println(btn_wishList.size());
		
		/*String actualTitle = "Your Store";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("WishList title verified: " + expectedTitle);*/

		
		/*for(int i=0;i<btn_wishList.size();i++) {
			String[] items=btn_wishList.get(i).getText();
			btn_wishList.click();*/

		
		
		
	}


