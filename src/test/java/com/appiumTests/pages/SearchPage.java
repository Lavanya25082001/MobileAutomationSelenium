package com.appiumTests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchPage {

	
	public AppiumDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"search\"]")
	WebElement search;
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@resource-id=\"android:id/search_src_text\"]")
	WebElement searchBar;
	@AndroidFindBy(xpath="(//android.widget.TextView[contains(@text,'Apple')])[1]")
	WebElement searchOption;
	@AndroidFindBy(xpath="//android.widget.ImageButton[@resource-id=\"com.project.kiranchavan.detoxfree:id/fab\"]")
	WebElement favouroite;
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id=\"com.project.kiranchavan.detoxfree:id/checkbox1\"]")
	WebElement ingredient1;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id=\"com.project.kiranchavan.detoxfree:id/checkbox2\"]")
	WebElement ingredient2;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id=\"com.project.kiranchavan.detoxfree:id/checkbox3\"]")
	WebElement ingredient3;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.project.kiranchavan.detoxfree:id/add_btn\"]")
	WebElement addShoppingList;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id=\"com.project.kiranchavan.detoxfree:id/step_1\"]")
	WebElement step1;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id=\"com.project.kiranchavan.detoxfree:id/step_2\"]")
	WebElement step2;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id=\"com.project.kiranchavan.detoxfree:id/step_3\"]")
	WebElement step3;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.project.kiranchavan.detoxfree:id/addNote\"]")
	WebElement addNote;
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"com.project.kiranchavan.detoxfree:id/editTextNote1\"]")
	WebElement addText;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.project.kiranchavan.detoxfree:id/saveNote\"]")
	WebElement saveNote;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]]")
	WebElement menu;
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text=\"Favorite List\"]")
	WebElement favList;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout")
	WebElement selectedItem;
	
	@AndroidFindBy(xpath="//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.project.kiranchavan.detoxfree:id/checkbox_shopping\"]")
	WebElement shopping;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.project.kiranchavan.detoxfree:id/delete_shoppinglist\"]")
	WebElement deleteShopping;
	
	
	
	public SearchPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public void searchItem() {
		search.click();
		searchBar.sendKeys("Apple");
		searchOption.isDisplayed();
		searchOption.click();
	}
	public void selectItemActions() {
		favouroite.click();
		ingredient1.click();
		ingredient2.click();
//		WebElement ingredient3 = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Water\"));"));
		ingredient3.click();
		addShoppingList.click();
		step1.click();
		step2.click();
		step3.click();
		addNote.click();
		addText.sendKeys("TODO");
		saveNote.click();
		 driver.navigate().back();
		 driver.navigate().back();
	}
	public void checkInMenu() {
		 driver.navigate().back();
		menu.click();
		favList.click();
		selectedItem.isDisplayed();
		 driver.navigate().back();
			menu.click(); 
		shopping.click();
		deleteShopping.click();
	}
}
