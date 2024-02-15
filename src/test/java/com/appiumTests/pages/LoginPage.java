package com.appiumTests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	public AppiumDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.project.kiranchavan.detoxfree:id/set_lang_btn\"]")
	WebElement selectLanguage;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.project.kiranchavan.detoxfree:id/btn_next\"]")
	WebElement nextBtn;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"android:id/button2\"]")
	WebElement laterBtn;
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
	WebElement allowBtn;
	@AndroidFindBy(xpath="//android.widget.Button[@text=\"Cancel\"]")
	WebElement cancelBtn;

	
	public LoginPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
	
	public void landingHomePage() {
		selectLanguage.click();
		try {
			while(nextBtn.isDisplayed()) {
				nextBtn.click();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			allowBtn.click();
			nextBtn.click();
			cancelBtn.click();
			laterBtn.click();
		}
		
	}
	
	
	
}
