package com.array.problem;

import java.util.Scanner;

public class array_operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array elements");
		int n=sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i <=a.length-1; i++) {
			a[i] =sc.nextInt();
		}
		
		for(int j=0 ; j<=a.length-1; j++) {
			for(int i=0 ; i<=a.length-2 ; i++) {
				if(a[i]>a[j]) {
					a[i] = a[i]+a[j];
					a[j] = a[i]-a[j];
					a[i] = a[i]-a[j];
					
				}
			}
			
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			
			
		}
		
		int sum=0;
		
		for (int i = 0; i <=a.length-1; i++) {
				sum+=a[i];
		}
		int avg = sum/n;
		
		System.out.println("sum ="+sum);
		System.out.println("Avg =" +avg);
		
		System.out.println("Min=" + a[0]);
		System.out.println("Max=" + a[a.length-1]);
		
	}
}
