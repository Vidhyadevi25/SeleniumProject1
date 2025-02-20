package org.test;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.*;
import org.utility.BaseClass;
import org.utility.LoginPage;

public class FaceBook extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass.."+new Date());
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		implicitwait(10);
	
		
	}
	@AfterClass
	private void afterClass() {
		 
	}
	@BeforeMethod
	private void beforeMethod() {

	}
	@AfterMethod
	private void afterMethod() {
		quit();
	}
	@Test
	private void test1() {
		LoginPage l=new LoginPage();
		//Assert.assertTrue(currentUrl().contains("facebook"));
		Assert.assertTrue(currentUrl().contains("facebook"));
		
		sendkeys(l.getUsername(), "vidhya");
		
		sendkeys(l.getPassword(), "12345");
		click(l.getLogin());
	}
	
	

}
