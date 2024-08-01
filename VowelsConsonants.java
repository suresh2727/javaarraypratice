package com.String.problem;

import java.util.Scanner;

public class VowelsConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to find Vowels and Consonants");
		String s = sc.next();
		char[] a = s.toCharArray();
		int vowels=0;
		int con=0;
		for (char c : a) {
			if('a'==c ||'e'==c ||'i'==c || 'o'==c || 'u'==c ||'A'==c ||'E'==c ||'I'==c || 'O'==c || 'U'==c  ) {
				vowels++;
			}
			else {
				con++;
			}
		}
		
		System.out.println("Vowels=" + vowels);
		System.out.println("Consonants=" + con);
		
	}
}
