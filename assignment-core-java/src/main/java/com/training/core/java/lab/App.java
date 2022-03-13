package com.training.core.java.lab;

import com.training.core.java.lab.day1.*;
import com.training.core.java.lab.day2and3.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Question1 q1 = new Question1();
        q1.divideNos(19, 4);
        
        q1.divideNos(18, 0);
        
        /*************************/
        
        Question2 q2 = new Question2();
        q2.kilometersToMiles(10);
        
        q2.kilometersToMiles(-7);
        
        /*************************/
        
        Question3 q3 = new Question3();
        q3.area(5, 7.4);
        
        q3.area(9.7);
        
        /****************************/
        Question2_1 q = new Question2_1();
        int n = q.smallestNumber(12, 2, 0);
        System.out.println("\nSmallest number is "+n);
        
        /***********************/
        Question2_2 student = new Question2_2(1,"Abc",20, 34, 45, 67);
        student.result();
        
        /***************************/
        Question2_3 stud = new Question2_3(1,"Abc",25, 57, 45, 67);
        System.out.println("Grade obtained: "+stud.result());
    }
}
