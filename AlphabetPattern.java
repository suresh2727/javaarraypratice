package com.CharPattern.problem;

public class AlphabetPattern {
	public static void main(String[] args) {
		
		char d = 65;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <=i; j++) {
				
				System.out.print(d + " ");
				d++;
			}
			d =65;
			System.out.println();
		}
	}
}
