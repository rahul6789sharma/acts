package com.stocksrin.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AllTestCases {

	@BeforeClass
	public static void oneTimeSetUp() {
		
		System.out.println("@AllTestCases - Started");

	}

	@AfterClass
	public static void oneTimeTearDown() {

		System.out.println("@AllTestCases - Completed");
	}

	@Test
	public void Test1() {
		System.out.println("test");
	}

}
