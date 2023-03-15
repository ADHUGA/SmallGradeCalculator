/*
 * GradeCalculator.java
 * Author:  Andrew Damian Hoskins 
 * Submission Date:  02/14/20
 *
 * Purpose: This program allows the user to input their hours worked per week to calculate
 * their gross and net pay along with various deductions.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
import java.util.Scanner;

public class GradeCalculator 
{
	public static void main(String[] args) 
	{
		int score, Exam1, Exam2, FinalExam, Labs, Projects, Participation, Quizzes;
		char grade;
		String WantedGrade, GradingAnswer;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Grading Scale:");
		System.out.println("A \t 90 - 100");
		System.out.println("B \t 80 - 89");
		System.out.println("C \t 70 - 79");
		System.out.println("D \t 60 - 69");
		System.out.println("F \t below 60");
		
		
		
		
		System.out.print("What letter grade do you want to achieve for this course?");
		WantedGrade = keyboard.next();
		
		System.out.println("Enter Percentage Weights");
		System.out.println("Exam 1: \t");
		Exam1 = keyboard.nextInt();
		System.out.println("Exam 2: \t");
		Exam2 = keyboard.nextInt();
		System.out.println("Labs: \t");
		Labs = keyboard.nextInt();
		System.out.println("Projects: \t");
		Projects = keyboard.nextInt();
		System.out.println("Participation: \t");
		Participation = keyboard.nextInt();
		System.out.println("Quizzes:");
		Quizzes = keyboard.nextInt();
		
		if (Exam1 + Exam2 + Labs + Projects + Participation + Quizzes == 100)
			System.out.println("Enter your scores out of a 100:");
		
		else
			System.out.println("Weights don't add up to 100, program exiting...");
		
		
		
		
		if (score >= 90 && score <= 100)
			grade = 'A';
		else if (score >= 80 && score < 90)
			grade = 'B';
		else if (score >= 70 && score < 80)
			grade = 'C';
		else if (score >= 60 && score < 70)
			grade = 'D';
		else if (score < 60)
			grade = 'F';
		
		System.out.print("Do you know your Exam 1 score?");
		Response = keyboard.next();
		if (Response.equalsIgnoreCase("yes") || Response.equals("y"))
			System.out.print("Score received on exam 1:");
			Exam1Score = keyboard.nextInt();
				System.out.print("Do you know your Exam 2 score?");
				Response = keyboard.next();
				if (Response.equalsIgnoreCase("yes") || Response.equals("y"))
					System.out.print("Score received on exam 2:");
					Exam2Score = keyboard.nextInt();
						System.out.print("Do you know your Final Exam score?");
						Response = keyboard.next();
						if (Response.equalsIgnoreCase("yes") || Response.equals("y"))
							System.out.println("Score received on final exam");
							Response = keyboard.next();
		
	}
}