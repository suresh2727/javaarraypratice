package com.array.problem;

import java.util.Scanner;

public class Array_subject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of student to find the Avg and total");
		int[] rollnu = new int[2];
		float[] marks1 = new float[2];
		float[] marks2 = new float[2];
		float[] marks3 = new float[2];
		
		for (int i = 0; i < rollnu.length; i++) {
			System.out.println("Enter the rollno");
			rollnu[i] =sc.nextInt();
			System.out.println("Enter the marks 1");
			marks1[i] = sc.nextFloat();
			System.out.println("Enter the marks 2");
			marks2[i] = sc.nextFloat();
			System.out.println("Enter the marks 3");
			marks3[i] = sc.nextFloat();
			
			
		}
		
		for (int i = 0; i < rollnu.length; i++) {
			float total_marks = marks1[i]+marks2[i]+marks3[i];
			float avg = total_marks/3;
			System.out.println("----------------------------------");
			System.out.println("Roll Number= " + rollnu[i]);
			System.out.println("Total Marks= " + total_marks);
			System.out.println("Average Marsk= " +avg);
			System.out.println("----------------------------------");
		}
	}
}
