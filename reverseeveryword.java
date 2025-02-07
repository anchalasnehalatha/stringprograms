package com.jsp.strings;

import java.util.Scanner;

public class reverseeveryword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String rev=" ";
		String arr[]=str.split(" ");
		for(int i=0;i<=arr.length-1;i++) {
			String r=reverse(arr[i]);
			rev=rev+r+" ";
		}
		System.out.println(rev);

}
	static String reverse(String str) {
		String rev=new StringBuffer(str).reverse().toString();
		return rev;
	}
}
