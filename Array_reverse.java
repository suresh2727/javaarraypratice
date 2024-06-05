package com.array.problem;

import java.util.Scanner;

public class Array_reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array elements");
		int n=sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i <=a.length-1; i++) {
			a[i] =sc.nextInt();
		}
		System.out.println("Reverse Array ");
		for(int i=0 ,j=a.length-1 ; i<j ; i++ ,j--) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
//		for (int j = a.length-1; j >=0; j--) {
//			System.out.print(a[j] + " ");
//		}
		
		for (int i = 0; i <=a.length-1; i++) {
			System.out.println(a[i]);
		}
	}
}
