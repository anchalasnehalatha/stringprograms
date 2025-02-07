package com.jsp.strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string1");
		String str1=sc.nextLine();
		System.out.println("Enter a string2");
		String str2=sc.nextLine();
		if(isanagram(str1,str2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}
	static boolean isanagram(String str1,String str2) {
		if(str1.length()!=str2.length()) 
			return false;
		
		char[] ch1=str1.toCharArray();
		
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s3=new String(ch1);
		String s4=new String(ch2);
		return s3.equals(s4);
		
		
	}

}
