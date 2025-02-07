package com.jsp.strings;
import java.util.Arrays;
import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		//displaying string one by one charatcer
//		char[] ch=str.toCharArray();
//		for(int i=0;i<=ch.length-1;i++) {
//			System.out.println(ch[i]);
//			
//		}
//		for(int i=0;i<=str.length()-1;i++) {
//			System.out.println(str.charAt(i));
//		}
		String str1=new StringBuilder(str).reverse().toString();
		System.out.println(str1);
		
		
	}

}
