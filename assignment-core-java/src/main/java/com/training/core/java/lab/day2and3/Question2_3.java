package com.training.core.java.lab.day2and3;

public class Question2_3 {
	int studentId;
	String studentName;
	int studentAge;
	int marks1;
	int marks2;
	int marks3;
	
	public Question2_3(int studentId, String studentName, int studentAge, int marks1, int marks2, int marks3){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	
	public String result() {
		int total = this.marks1 + this.marks2 + this.marks3;
		int average = total/3;
		if(average>=90)
			return "A+";
		else if(average>=80)
			return "A";
		else if(average >= 70)
			return "A-";
		else if(average >= 60)
			return "B+";
		else if(average >=50)
			return "B";
		else
			return "FAIL";
	}
	
	public static void main( String[] args )
    {
		Question2_3 stud = new Question2_3(1,"Abc",25, 57, 45, 67);
        System.out.println("Grade obtained: "+stud.result());
    }
}
