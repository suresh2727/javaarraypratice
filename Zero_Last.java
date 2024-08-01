package com.array.problem;

import java.util.Scanner;

public class Zero_Last {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		 int[] a = new int[n];
		 
		 System.out.println("Enter the array elements");
		 for (int i = 0; i < a.length; i++) {
			a[i] =sc.nextInt();
		}
		
		
		 int j=0;
		 for (int i = 0; i <=a.length-1; i++) {
			 if(a[i]!=0) {
					a[j] = a[i];
					j++;
				}
		}
		 
		 while(j<=a.length-1) {
			 a[j]=0;
			 j++;
		 }
		
		
		System.out.println("Update array");
		System.out.println("Enter the array elements");
		 for (j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}
