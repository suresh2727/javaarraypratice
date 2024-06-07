package com.array.problem;

import java.util.Scanner;

public class Duplicate_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements");
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] =sc.nextInt();
		}
		int count =0;
		int res=0;
		for (int j = 0; j < a.length; j++) {
			for (int i=0 ; i<a.length ; i++) {
				if(a[i]==a[j]) {
					count++;
					if(count>3) {
						res=a[i];
						count=0;
					}
				}
			
		}
	}
		System.out.println("Duplicate element present in = " +res);
	}
}
