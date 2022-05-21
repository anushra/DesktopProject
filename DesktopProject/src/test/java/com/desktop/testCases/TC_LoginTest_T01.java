package com.desktop.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.desktop.pageObjects.LoginPage;

public class TC_LoginTest_T01 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		logger.info("Launching the browser");
		driver.get(baseUrl);
		LoginPage lp= new LoginPage(driver);
		logger.info("entering username...");
		lp.setUserName(UserName);
	    Thread.sleep(2000);
	    logger.info("entering password...");
		lp.setPassword(Password);
		logger.info("click on password button");
		lp.clickOnLoginButton();
		
		if(driver.getTitle().equals("Guru99 HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Testcase passed");
		}
		else 
		{
			captureScreenshot(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("TestcaseFailed");
		}
		
	}

}
