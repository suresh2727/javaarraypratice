package com.String.problem;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Rev_Sentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String[] m = s.split(" ");
		
		char[] a = new char[s.length()];
//		for(int i=0;i<=s.length()-1 ; i++) {
//			a[i] = m[i];
//		}
	   

		LinkedList<String> lst = new LinkedList<>();
		for (int i = 0; i < m.length; i++) {
			lst.add(i, m[i]);
		}
		
		
		
		ListIterator<String> itr = lst.listIterator();
		while(itr.hasNext()) {
			itr.next();
		}
		
		while(itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}
		
		}
	}

