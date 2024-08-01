package com.array.problem;

import java.util.Scanner;

public class ToremoveSpaceinString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		char[] a = sc.nextLine().toCharArray();
		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=32) {
				System.out.print(a[i]);
			}
		}
	}
}
