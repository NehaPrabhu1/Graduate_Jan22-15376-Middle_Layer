package com.training.core.java.lab.day2and3;

public class Question2_4 {
	
	public static int getLuckyNumber(int n) {
		if(n/10 == 0) {
			return n;
		}
		int sum = 0;
		while(n>0) {
			int d = n%10;
			sum += d;
			n /= 10;
		}
		return getLuckyNumber(sum);
	}
	public static void main( String[] args )
    {
		System.out.println("Lucky number: "+ getLuckyNumber(123457890));
    }

}
