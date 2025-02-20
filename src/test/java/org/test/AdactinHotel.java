package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.utility.AdactinLogin;
import org.utility.AdactinSearchHotel;
import org.utility.BaseClass;

public class AdactinHotel extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		implicitwait(10);
		
	}
	@AfterClass
	private void afterClass() {
		
		quit();
	}
	
	@AfterMethod
	private void afterMethod() {

	}
	@BeforeMethod
	private void beforeMethod() {

	}
	@Test(priority=1)
	private void loginpage() {
		AdactinLogin l=new AdactinLogin();
		asserttrue("adactin", "URL verify");
		sendkeys(l.getUsername(), "VidhyaMagi");
		assertequals("VidhyaMagi", l.getUsername(), "username verify");
		sendkeys(l.getPassword(), "VidhyaMagi");
		assertequals("VidhyaMagi", l.getPassword(), "password verify");
		click(l.getLogin());
	}
	
	@Test(priority=2)
	private void searchHotel() {
		asserttrue("SearchHotel", "SearchHotel page verify");
		AdactinSearchHotel s=new AdactinSearchHotel();
		selectByValue(s.getLocation(), "London");
		selectByValue(s.getHotel(), "Hotel Cornice");
		selectByValue(s.getRoomtype(), "Double");
		selectByIndex(s.getNumofroom(), 1);
		clear(s.getCheckin());
		sendkeys(s.getCheckin(), "29/12/2024");
		clear(s.getCheckout());
		sendkeys(s.getCheckout(), "05/01/2025");
		selectByIndex(s.getAdult(), 2);
		selectByIndex(s.getChildren(), 1);
		click(s.getSearch());
		asserttrue("SelectHotel", "verify selecthotel Url");
		click(s.getSelecthotel());
		click(s.getContinu());
	}
	
	@Test(priority=3)
	private void bookHotel() {
		asserttrue("BookHotel", "bookhotel url verify");
		AdactinSearchHotel s=new AdactinSearchHotel();
		sendkeys(s.getFirstname(), "vidhya");
		sendkeys(s.getLastname(), "devi");
		sendkeys(s.getAddress(), "Fairlands,salem-636016");
		sendkeys(s.getCreditcardnum(), "2345678945679876");
		selectByValue(s.getCardtype(), "MAST");
		selectByIndex(s.getExpmonth(), 3);
		selectByVisibleText(s.getExpyear(), "2030");
		sendkeys(s.getCvvnum(), "344");
		click(s.getBooknow());
		
	}
	@Test(priority=4)
	private void confirmBooking() {
		AdactinSearchHotel s=new AdactinSearchHotel();
		System.out.println("order No : "+getAttribute(s.getOrderno()));
		asserttrue("BookingConfirm", "BookingConfirm url verify");
		click(s.getLogout());
		
		WebElement table=driver.findElement(By.xpath("//td[@class='reg_success']"));
		String text=table.getText();
		System.out.println(text);

		
		

	}

	 

}
