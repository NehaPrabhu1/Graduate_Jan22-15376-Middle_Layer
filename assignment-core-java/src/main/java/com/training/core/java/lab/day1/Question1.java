package com.training.core.java.lab.day1;

public class Question1 {
	
	public void divideNos(int num1, int num2) {
		System.out.println("For the numbers "+num1 + " and "+num2+" : ");
		if(num2 != 0) {
			int q = num1/num2;
			int r = num1%num2;
	
			System.out.println("Quotient = "+ q +" Remainder = "+r);
		}
		else {
			System.err.println("Division not possible!");
		}
		System.out.println("");
	}
	
	public static void main( String[] args )
    {
		Question1 q1 = new Question1();
        q1.divideNos(19, 4);
        
        q1.divideNos(18, 0);
    }
 }
