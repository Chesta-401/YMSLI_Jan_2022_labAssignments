
//program called GradesAverage, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the 
//grades of each of the students and saves them in an int array called grades. Your program shall 
//check that the grade is between 0 and 100. A sample session is as follow:
//Enter the number of students: 3
//Enter the grade for student 1: 55
//Enter the grade for student 2: 108
//Invalid grade, try again...
//Enter the grade for student 2: 56
//Enter the grade for student 3: 57
//The average is: 56.0

package ques3;

import java.util.*;
public class GradesAverage{

public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	float average=0;
	int sum= 0;
	System.out.print("Enter the number of students: ");
	int numStudents = sc.nextInt();
	int[] grades = new int[numStudents];
	for(int i=1;i<=numStudents;i++) {
	System.out.print("Enter the grade for student "+i+": ");
	grades[i-1] = sc.nextInt();
	while(grades[i-1]<0 || grades[i-1]>100) {
		System.out.println("Invalid grade, try again...");
		System.out.print("Enter the grade for student "+i+": ");
		grades[i-1] = sc.nextInt();
		
	}
	sum+=grades[i-1];
	}
	average =sum/numStudents;
	System.out.println("The average is: "+average);
	
	

}

}