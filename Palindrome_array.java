package com.array.problem;

import java.util.Scanner;

public class Palindrome_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements in 2digits");
		for (int i = 0; i < a.length; i++) {
			a[i] =sc.nextInt();
		}
		int r;
		
		for (int i = 0; i < a.length; i++) {
		int c =a[i];
		int b=0;
			while(a[i]!=0) {
				r=a[i]%10;
				b=b*10;
				b=b+r;
				a[i]=a[i]/10;
				
			}
			
			if(c==b) {
				System.out.println(c);
		}
	}
		
		
		
		
		//System.out.println("Reverse "+b);
		
	}
}
