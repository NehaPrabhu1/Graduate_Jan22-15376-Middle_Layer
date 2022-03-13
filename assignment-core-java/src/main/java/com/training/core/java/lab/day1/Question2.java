package com.training.core.java.lab.day1;

public class Question2 {
	
	public void kilometersToMiles(double km) {
		if(km >= 0) {
			double miles = km * 0.621371;
			System.out.println(km+"km = " +miles +" miles");
		}
		else {
			System.err.println("Wrong data!\n");
		}
	}
	
	public static void main( String[] args )
    {
		 Question2 q2 = new Question2();
	        q2.kilometersToMiles(10);
	        
	        q2.kilometersToMiles(-7);
    }

}
