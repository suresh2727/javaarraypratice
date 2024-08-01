package com.Patterns.problem;

public class Pattern3 {
	public static void main(String[] args) {
		
		int n=4;
	
		 int i, j;
	        int num = 1;
	        for (i = 0; i <= n; i++) {
	            for (j = 0; j <= i; j++) {
	            	 {
	            		System.out.print(" ");
	            	}
	                
	            }
	            for (j = 0; j <=n; j++) {
	            	{
	            		System.out.print("*" + " ");
	            	}
	      
	            }
	            System.out.println();
	        }
	    }
	}

