package com.main.algo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// 2 kind of librarries : 1. Assertion Library, 2. Runner Library
// jasmine and karma : 
// chai and mocha 
// 

class StringAlgoTest
{
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		System.out.println("Runs Before All test cases : ONCE");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception
	{
		System.out.println("This runs AFTER all test caes : ONCE");
	}

	@BeforeEach
	void setUp() throws Exception
	{
		System.out.println("Before Every test case");
	}

	@AfterEach
	void tearDown() throws Exception
	{
		System.out.println("After every test case");
	}

	@Test
	void testShift2Chars()
	{
		StringAlgo algo = new StringAlgo();
		String input = "hello";
		String expected = "llohe";
		String actual = algo.shift2Chars(input);
		assertEquals(expected,actual);
	}
	@Test
	void testShift2Chars2()
	{
		StringAlgo algo = new StringAlgo();
		String input = "program";
		String expected = "ogramp";
		String actual = algo.shift2Chars(input);
		assertEquals(expected,actual);
	}

}
