package com.appiumTests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExitPage {
	public AppiumDriver driver;
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text=\"Favorite List\"]")
	WebElement favList;
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@resource-id=\"com.project.kiranchavan.detoxfree:id/design_menu_item_text\" and @text=\"//android.widget.CheckedTextView[@resource-id=\"com.project.kiranchavan.detoxfree:id/design_menu_item_text\" and @text=\"Exit\"]\"]")
	WebElement exitApp;
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
	WebElement menu;
	
	public ExitPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public void exit() {
		try {
			while(menu.isDisplayed()) {
				menu.click();
				if(favList.isDisplayed()) {
					WebElement exitApp = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Exit\"));"));
					exitApp.click();
					break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
