package com.training.core.java.lab.day2and3;

public class Question2_11 {

	public static void main(String[] args) {
		int x = 10;
		do {
			if(x-- > 2) {
				break;
				//System.out.print(x+" ");--> unreachable statement
			}
		}while(x>5);
	}
}
//OptionE - Compilation error