package com.jsp.strings;

import java.util.Scanner;

public class reversethewords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		String rev=" ";
		for(int i=arr.length-1;i>=0;i--) {
			rev+=arr[i];
		}
		System.out.println(rev);

}
}
