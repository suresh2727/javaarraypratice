package com.array.problem;

import java.util.Scanner;

public class Sec_Large {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements");
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] =sc.nextInt();
		}
		
		for (int j = 0; j < a.length; j++) {
			for (int i=0 ; i<a.length-1 ; i++) {
				if(a[i]>a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[i];
				
					}
			}
			
		}
		
		
		System.out.println("Second Largest= " + a[a.length-2]);
	}
}
