package com.jsp.strings;

import java.util.Scanner;

public class lengthofstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++){
			count++;
			
		}
		System.out.println(count);
}

}
