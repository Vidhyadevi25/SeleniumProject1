package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample {
	
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass ");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass ");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Beforemethod ");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("aftermethod ");
	}
	@Test
	private void test1() {
		System.out.println("test1");

	}
	@Test(priority=-3,invocationCount=4)
	private void test2() {
		System.out.println("test2");
	}
	@Test(priority=2,enabled=false)
	private void test3() {
		System.out.println("test3");
	}
	@Test(priority=1)
	private void test4() {
		System.out.println("test4");
	}
	

}
