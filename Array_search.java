package com.array.problem;

import java.util.Scanner;

public class Array_search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		int count=0;
		
		for (int i = 0; i <= a.length-1; i++) {
			a[i] =sc.nextInt();
		}
		
		System.out.println("Enter the search element");
		int x = sc.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==x) {
				count++;
			}
		}
		 
		if(count>0) {
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present");
		}
		
	}
}
