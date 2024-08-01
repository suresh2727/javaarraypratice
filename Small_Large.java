package com.array.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Small_Large {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array size");
		int n = sc.nextInt();
		
		int[] a=new int[n];
		//Arrays.sort(a);
		System.out.println("Enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int j = 0; j <=a.length-1; j++) {
			for (int i = 0; i <=a.length-2; i++) {
				if(a[i]>a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] -a[j];
					
				}
			}
		}
		
		System.out.println("Small=" + a[0]);
		System.out.println("Large=" + a[a.length-1]);
	}
}
