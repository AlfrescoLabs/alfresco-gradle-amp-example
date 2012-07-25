package com.example.ampgradleexample;

/**
 * Outputs a message on init
 * 
 * @author rgauss
 */
public class MyRepoClass {
	
	public void init() {
		System.out.println("\n\n********** " + this.getClass().getCanonicalName() + 
				": I'm a special repo class that can add. See: 1+1=" + getResult(1, 1)
				+ "********** \n\n");
	}
	
	public static int getResult(int a, int b) {
		return a + b;
	}
	
}
