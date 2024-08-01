package com.array.problem;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestSumOddEvenArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the array elements to find the Second largest sum");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		
		int[] even = new int[n];
		int[] odd = new int[n];
		for (int i = 0; i < even.length; i++) {
			if(a[i]%2==0) {
				even[i] = a[i];
			}
			else {
				odd[i] = a[i];
			}
		}
		
		int sum= 0;
		
		Arrays.sort(even);
		Arrays.sort(odd);
		
		sum = even[a.length-2] + odd[a.length-2];
		
		
//		1 3 4 7 9 
//		1 3 9
//		4 7
		System.out.println("sum " + sum);
		
		
	}
}
