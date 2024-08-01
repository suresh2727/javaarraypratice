package com.String.problem;

import java.util.Scanner;

public class Max_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to find the maxium occurance of char");
		String s = sc.next();
		char[] a = s.toCharArray();
		int count =0;
		for (char i: a) {
			count=0;
			for (char c : a) {
				if(c==i) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(i);
				return;
			}
		}
		
	}
}
