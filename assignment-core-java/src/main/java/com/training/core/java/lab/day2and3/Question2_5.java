package com.training.core.java.lab.day2and3;
/**
 * 
 * @author neha15376
 * accepting a number and display the multiplication table of the given number
 */
public class Question2_5 {
	
	public static void getTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n +" * "+i+" = "+i*n);
		}
	}
	
	public static void main( String[] args )
    {
		getTable(19);
		
    }

}
