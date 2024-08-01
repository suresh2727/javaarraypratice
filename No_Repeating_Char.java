package com.String.problem;

import java.util.Scanner;

public class No_Repeating_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to find the no repeating char");
		String s = sc.next();
		char[] c = s.toCharArray();
	
		int count=0;
		for(char i:c) {
			count=0;
			for (char d : c) {
				if(i==d) {
					count++;
				}
		}
			if(count==1) {
				System.out.println(i);
		}
		}
		
	}
}

