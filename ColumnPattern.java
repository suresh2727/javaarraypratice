package com.CharPattern.problem;

public class ColumnPattern {
	public static void main(String[] args) {
		char a=65;
		char b=0;
		char d=65;
		int count=0;
		int v=9;
		int k=1;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if(j%2==0) {
					d = (char) (a+v);
					System.out.print(b + " ");
					v--;
				}
				else if(j==1) {
					System.out.print(a + " ");
				}
				else {
					b =(char) (b+k);
					System.out.print(b + " ");
					k++;
				}
				
			}
			
			System.out.println();
			count++;
			a=(char) (65+count);
		}
	}
}
