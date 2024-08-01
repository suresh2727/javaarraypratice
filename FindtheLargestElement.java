package com.array.problem;

import java.util.Scanner;

public class FindtheLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.println("Enter the array elements to find the largest element");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[i]<a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
					
				}
			}
		}
		
		System.out.println("The largest element is = " + a[a.length-1]);
	}
	
	
	
}
