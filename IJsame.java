package com.CharPattern.problem;

public class IJsame {
	public static void main(String[] args) {
		 char c = 69;
		 char k = 69;
		 int n=5;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i; j++) {
					System.out.print(c + " ");
					c--;
					
			}
			for (int j = 1; j < n-i; j++) {
				System.out.print(k+ " ");
			}
			k--;
			c=69;
			System.out.println();
		}
	
		
		
		for (int i = 0; i < n; i++) {
			
			System.out.println();
		}
	}
}
