package com.training.core.java.lab.day1;

public class Question3 {
	
	public void area(double l, double b) {
		if(l <0 || b < 0) {
			System.out.println("Wrong data");
		}
		else {
			System.out.println("Area of rectange = "+l*b);
		}
	}
	
	public void area(double s) {
		if(s<0) {
			System.out.println("Wrong data");
		}
		else {
			System.out.println("Area of square = "+s*s);
		}
	}
	
	public static void main( String[] args )
    {
		Question3 q3 = new Question3();
        q3.area(5, 7.4);
        
        q3.area(9.7);
    }

}
