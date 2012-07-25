package com.example.ampgradleexample;

import org.junit.Test;

import junit.framework.TestCase;

public class MyRepoClassTest extends TestCase {

	@Test
	public void testGetResult() {
		assertEquals(2, MyRepoClass.getResult(1, 1));
	}

}
