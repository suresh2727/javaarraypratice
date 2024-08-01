package com.array.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Wave_in_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the array elements in arrray");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		Arrays.sort(a);
		
//	for (int i = a.length-1; i>=0; i-=2) {
//		b[j]=a[i];
//		j++;
//		
//	}
//	for (int i = 0; i < a.length; i+=2) {
//		b[j]=a[i];
//		}
//		

		int i=0 , j=0;
		for(j=0 , i=a.length-1 ; j<i ; j++,i--) {
			System.out.println(a[i]);
		System.out.println(a[j]);
		}
		
		
		
	}
}
