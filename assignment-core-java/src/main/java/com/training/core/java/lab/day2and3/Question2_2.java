package com.training.core.java.lab.day2and3;
/**
 * 
 * @author neha15376
 * Calculate Total and Percentage. If percentage is greater than 50 then display “PASS” else display “FAIL”
 */
public class Question2_2 {
	
	int studentId;
	String studentName;
	int studentAge;
	int marks1;
	int marks2;
	int marks3;
	
	public Question2_2(int studentId, String studentName, int studentAge, int marks1, int marks2, int marks3){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	private double calculatePercent() {
		int total = this.marks1 + this.marks2 + this.marks3;
		double percentage = (total/3.0);
		return percentage;
	}
	
	public void result() {
		double p = calculatePercent();
		if(p>50.0) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public static void main( String[] args )
    {
		Question2_2 student = new Question2_2(1,"Abc",20, 34, 45, 67);
        student.result();
    }

}
