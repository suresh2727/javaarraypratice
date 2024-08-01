package com.String.problem;

import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1 = sc.next();
		System.out.println("Enter the char to remove");
		char[] s2=sc.next().toCharArray();
		
		char[] a =s1.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==s2[0]) {
				a[i]=0;
				
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				System.out.print(a[i]);
			}
		}
		
		
		
		
	}
}
