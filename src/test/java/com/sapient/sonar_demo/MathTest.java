package com.sapient.sonar_demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

	private MathDemo mathDemo;

	@Before
	public void setUp() throws Exception {
		mathDemo = new MathDemo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int result = mathDemo.add(5, 3);
		assertEquals(8, result);
		
	}

	@Test
	public void testSubtract() {
		int result = mathDemo.subtract(10, 4);
		assertEquals(6,result);
	}

}