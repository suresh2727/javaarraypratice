package com.CharPattern.problem;

public class SquarePatternChar {
	public static void main(String[] args) {
		char c = 65;
		char count =1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				System.out.print(c + " ");
				c++;
				
			}
			
			c=(char) (65+count);
			count++;
			System.out.println();
		}
	}
}
