package com.String.problem;

import java.util.Scanner;

public class Rev_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Reverse");
		String s = sc.next();
		char[] a=s.toCharArray();
		char temp;
		for(int i=0 , j=a.length-1 ; i<j ; i++ ,j--) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
		}
		
		for (char c : a) {
			System.out.print(c);
		}
	}
}
