package com.CharPattern.problem;

public class ColumnChar {
	public static void main(String[] args) {
		char c = 65;
		int l=0;
		int n=5;
		while(l!=5) {
			for (int i = l; i <=n; i++) {
				System.out.println(c + " ");
				c++;
			}
			l++;
			n++;
			System.out.println(); 
		}
		
	}
}
