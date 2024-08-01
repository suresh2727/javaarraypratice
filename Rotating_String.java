package com.String.problem;

import java.util.Scanner;

public class Rotating_String {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next()+"00";
		
		System.out.println("Enter the String2 ");
		String s2 =sc.next();
		int x=2;
		int y = s1.length();
		char[] a = new char[y+x];
		//System.out.println(a.length);
		
		a=s1.toCharArray();
		
	//	System.out.println(a.length-1);
		int i=0;
		int j=a.length-1;
		
		for (int j2 = 0; j2 < 2; j2++) {
			a[j-1]=a[i];
			a[i]=0;
			i++;
			j++;
			
			
		}
		
		
		
		//suresh
		//reshsu
		String s3=null;
		for (int j2 = 0; j2 < a.length; j2++) {
			if(a[j2]!='0') {
				s3 = new String(a);
			}
		} 
		
		System.out.println(s3);
		
	}
}
