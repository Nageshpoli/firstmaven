package com.mytests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNg {

	@BeforeMethod
	public void beforemethod1() {
		System.out.println("beforemethod1");
	}

	@BeforeTest
	public void beforetest1() {
		System.out.println("beforetest1");
	}

	@BeforeClass
	public void beforeclass1() {
		System.out.println("beforeclass1");
	}

	@Test
	public void myfirsttest() {
		System.out.println("myfirsttest");
		assertTrue(true);
	}

	@Test
	public void mysecondtest() {
		System.out.println("mysecondtest");
		assertTrue(true);
	}

	@AfterTest
	public void aftertest1() {
		System.out.println("aftertest1");
	}

	@AfterMethod
	public void aftermethod1() {
		System.out.println("aftermethod1");
	}

	@AfterClass
	public void afterclass1() {
		System.out.println("afterclass1");
	}
}
