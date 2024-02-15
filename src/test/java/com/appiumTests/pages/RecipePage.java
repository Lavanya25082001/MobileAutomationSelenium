package com.appiumTests.pages;
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.pagefactory.AndroidFindBy;
	import io.appium.java_client.pagefactory.AppiumFieldDecorator;

	public class RecipePage {

	public AppiumDriver driver;
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text=\"WATER\"]")
		WebElement waterRecipe;
		@AndroidFindBy(xpath="//android.widget.TextView[@text=\"123 RECIPES\"]")
		WebElement waterRecipes;
		@AndroidFindBy(xpath="//android.widget.TextView[@text=\"SMOOTHIE\"]")
		WebElement smoothieRecipe;
		@AndroidFindBy(xpath="//android.widget.TextView[@text=\"112 RECIPES\"]")
		WebElement smoothieRecipes;
		@AndroidFindBy(xpath="//android.widget.TextView[@text=\"SOUP\"]")
		WebElement soupRecipe;
		@AndroidFindBy(xpath="//android.widget.TextView[@text=\"53 RECIPES\"]")
		WebElement soupRecipes;
		@AndroidFindBy(xpath="//android.widget.TextView[@text=\"TEA\"]")
		WebElement teaRecipe;
		@AndroidFindBy(xpath="//android.widget.TextView[@text=\"30 RECIPES\"]")
		WebElement teaRecipes;
		@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
		WebElement backBtn;

		public RecipePage(AppiumDriver driver) {
			this.driver = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}	
		public void recipeList() {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		
			waterRecipes.getText();
			waterRecipe.click();
			 driver.navigate().back();
			smoothieRecipes.getText();
			smoothieRecipe.click();
			driver.navigate().back();
			WebElement soupRecipe = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"SOUP\"));"));
			System.out.println(soupRecipes.getText()+"=======================");
//			js.executeScript("window.scrllBy(0, 1400)");
			soupRecipe.click();
			backBtn.click();
			WebElement teaRecipe = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"TEA\"));"));
			System.out.println(teaRecipes.getText()+"=========================");;
			teaRecipe.click();
			backBtn.click();
			
			
	}
	
}   
