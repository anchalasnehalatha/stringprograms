package com.jsp.strings;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		if(ispalindrome(str)) {
			System.out.println("yes");
		}
		else {
			System.out.println("not palin");
		}
	}
		static boolean ispalindrome(String str) {
			int i=0;
			int j=str.length()-1;
			
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
				
			}
			i++;
			j--;
		}
		return true;


}
}
