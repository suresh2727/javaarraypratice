package com.Patterns.problem;

public class Pattern4 {
	public static void main(String[] args) {
		int n=5;
		
		 int i, j;
	        int num = 1;
	        for (i = 1; i <= n; i++) {
	            for (j = 1; j <= i; j++) {
	            	 {
	            		System.out.print(" ");
	            		 
	            	}
	                
	            }
	            for (j = 1; j <=n; j++) {
	      
	            	if(i==1 || i==n || j==1 || j==n) {
	            		System.out.print("*");
	            	}
	            	else {
	            		 System.out.print(" ");
	            	}
	               
	            	
	            }
	            System.out.println();
	        }
	}
}
