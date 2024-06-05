package com.array.problem;

import java.util.Scanner;

public class Array_odd_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array elements");
		int n=sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i <=a.length-1; i++) {
			a[i] =sc.nextInt();
		}
		
		int sum=0;
		
		for (int i = 0; i <=a.length-1; i++) {
			if(a[i]%2!=0) {
				sum+=a[i];
			}
		}
		
		System.out.println("Sum of odd number= " +sum);
	}
}
