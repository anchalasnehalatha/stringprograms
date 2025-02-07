package com.jsp.strings;

import java.util.Scanner;

public class countingdalphaspe {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		int alphacount=0,digitcount=0,specialcount=0;
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
			alphacount++;
			
		}
		else if(ch>='0'&&ch<='9') {
			digitcount++;
		}
		else {
			specialcount++;
		}
		}
		System.out.println(alphacount);
		System.out.println(digitcount);
		System.out.println(specialcount);
		
}
}
