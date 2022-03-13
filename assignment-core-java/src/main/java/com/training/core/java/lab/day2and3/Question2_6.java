package com.training.core.java.lab.day2and3;
/**
 * 
 * @author neha15376
 * accepting three numbers and display the lowest number out of three numbers
 */
public class Question2_6 {
	
	public static int getLowestNumber(int a, int b, int c) {
		int result = (a<b)?((a<c)?a:c):(b<c?b:c);
		return result;
	}
	
	public static void main( String[] args )
    {
		int lowest = getLowestNumber(12,2,0);
		System.out.println("Lowest number:"+lowest);
		
		lowest = getLowestNumber(12,-2,0);
		System.out.println("Lowest number:"+lowest);
		
		lowest = getLowestNumber(-12,2,0);
		System.out.println("Lowest number:"+lowest);
		
		lowest = getLowestNumber(0,0,0);
		System.out.println("Lowest number:"+lowest);
    }

}
