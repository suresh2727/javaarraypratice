package com.String.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		char[] a = s.toCharArray();
		int ind=0;
		for (int i = 0; i < a.length; i++) {
			int j;
			for ( j = 0; j < i; j++) {
				if(a[i]==a[j]) {
					break;
				}
			}
			
			if(j==i) {
				a[ind++]=a[i];
				
			}
		}
		
		System.out.println(String.valueOf(Arrays.copyOf(a, ind)));
		
		
	}
}
