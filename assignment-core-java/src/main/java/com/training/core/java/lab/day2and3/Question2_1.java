package com.training.core.java.lab.day2and3;

public class Question2_1 {
	public int smallestNumber(int n1, int n2, int n3) {
		if(n1 < n2) {
			if(n1<n3) {
				return n1;
			}
		}
		else {
			if(n2<n3) {
				return n2;
			}
		}
		return n3;
	}
	public static void main( String[] args )
    {
		Question2_1 q = new Question2_1();
        int n = q.smallestNumber(12, -2, 0);
        System.out.println("Smallest number is "+n);
    }

}
