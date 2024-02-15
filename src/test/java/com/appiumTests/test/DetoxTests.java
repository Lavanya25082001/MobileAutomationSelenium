package com.appiumTests.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appiumTests.base.Base;
import com.appiumTests.pages.ExitPage;
import com.appiumTests.pages.LoginPage;
import com.appiumTests.pages.RecipePage;
import com.appiumTests.pages.SearchPage;

public class DetoxTests extends Base {
	private static final Logger logger = LogManager.getLogger(DetoxTests.class);
	LoginPage detoxPage;
	SearchPage searchpage;
	RecipePage recipePage;
	ExitPage exitPage;
	@BeforeTest
	public void getPages() {
		detoxPage=new LoginPage(driver);
		searchpage= new SearchPage(driver);
		recipePage= new RecipePage(driver);
		exitPage= new ExitPage(driver);
	}

	@BeforeTest
	public void gotoHomePage() {
		detoxPage.landingHomePage();
	}	
	@Test(priority=1)
	public void searchPage() {
		logger.info("Search actions on detox application");
		test = extent.createTest("searching for recipes").assignAuthor("Lavanya");
		searchpage.searchItem();
		searchpage.selectItemActions();
		//searchpage.checkInMenu();
	}
	@Test(priority=2)
	public void recipePage() {
		logger.info("recipe actions on detox application");
		test = extent.createTest("count recipes").assignAuthor("Lavanya");
		recipePage.recipeList();
}
	@AfterTest
	public void close() {
		exitPage.exit();
	}
}