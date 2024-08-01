package com.array.problem;

import java.util.Scanner;

public class Pair_Sum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the array elements");
		int n= sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to find the pair");
		int x = sc.nextInt();
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i] + a[j] < x && Math.floor(a[i] + a[j]) < x  ) {
						System.out.println("Pairs=" + a[i] +  " " + a[j]);
						return;
				}
			}
		}
		
		
	}
}
