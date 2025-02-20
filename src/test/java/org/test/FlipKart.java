package org.test;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class FlipKart extends BaseClass{
	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass.."+new Date());
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		implicitwait(10);	
	}
	@AfterClass
	private void afterClass() {
		 
	}
	@BeforeMethod
	private void beforeMethod() {
		

	}
	@AfterMethod
	private void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		quit();
	}
	@Test
	private void test1() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone",Keys.ENTER);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		
		List<WebElement> mobileList = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
//		String mobiles = "";
//		for(WebElement list:mobileList) {
//			mobiles = list.getText();		
//		}
//		String price;
//		int finalprice = 0;
//		for(int i=0;i<mobileList.size();i++) {
//			price=priceList.get(i).getText();
//			price= price.replaceAll("[^0-9]", "");
//			finalprice=Integer.parseInt(price);
//			}
		
		Map<String, Integer> mobileDetils=new TreeMap<>();	
	//	mobileDetils.put(mobiles, finalprice);
		
		for(int i=0;i<mobileList.size();i++) {
			mobileDetils.put(mobileList.get(i).getText(),Integer.parseInt((priceList.get(i).getText()).replaceAll("[^0-9]", "")));
		}  
		Set<Entry<String,Integer>> m=mobileDetils.entrySet();
		for(Entry<String,Integer> x:m) {
			System.out.println(x);
		}	
		Thread.sleep(5000); 
		WebElement scrl = driver.findElement(By.xpath("(//img[@class='DByuf4'])[24]"));
		WebElement two = driver.findElement(By.xpath("//a[contains(@class,'cn++Ap')][2]"));
		scrollDown(scrl);
		click(two);
		Thread.sleep(2000);

		List<WebElement> mobileList2 = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> priceList2 = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		Map<String, Integer> mobileDetil=new TreeMap<>();	
		
		for(int i=0;i<mobileList2.size();i++) {
			mobileDetil.put(mobileList2.get(i).getText(),Integer.parseInt((priceList2.get(i).getText()).replaceAll("[^0-9]", "")));
		}  
		
		
		Set<Entry<String,Integer>> m2=mobileDetil.entrySet();
		for(Entry<String,Integer> x:m2) {
			System.out.println(x);
		}	
		
		
		
	}

}
