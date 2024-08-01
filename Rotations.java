package com.String.problem;

import java.util.Scanner;

public class Rotations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		char[] a = s.toCharArray();
		int count=0;
		for (int i = 0,j=a.length-1 ;i < j; i++ , j--) {
			if(a[i]!=a[j]) {
				System.out.println("Not a Palindrome");
				break;
			}
			else {
				System.out.println("It is a Palindrom");
				break;
			}
		}
		
		
		
	}
}
