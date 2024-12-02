package testcases;

import org.testng.annotations.Test;

import generic.Sample;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class MyTest extends Sample {
	@Test
	public void openBrowser() {
		
		System.out.println("testtttt");
		
		
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("After class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	

}
