package com.CharPattern.problem;

public class CapitalK {
	public static void main(String[] args) {
		int n=6;
		char c = 65;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= n-1; j++) {
				System.out.print(c + " ");
				c++;
			}
			n--;
			c=65;
			System.out.println();
		}
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
			c=65;
		}
		
	}
}
