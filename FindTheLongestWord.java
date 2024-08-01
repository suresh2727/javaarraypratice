package com.String.problem;

import java.util.Scanner;

public class FindTheLongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to find the longest word");
		String s = sc.nextLine();
		
	
		
		String[] m = s.split(" ");
		
		int[] a = new int[m.length];
		String temp;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length-1; j++) {
				if(m[i].length() < m[j].length()) {
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		
			System.out.print(m[m.length-1]);
	
		
				
	}
}
