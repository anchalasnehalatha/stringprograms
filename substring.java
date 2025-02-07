package com.jsp.strings;
import java.util.Scanner;

public class substring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		int len=0;
		String longest="";
		
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length();j++) {
				String sub=str.substring(i,j);
				//System.out.println(sub);//print all the substrings
				if(ispalindrome(sub)) {
					//System.out.println(sub);//palindrome substrngs
					if(sub.length()>len) {
						len=sub.length();
						longest=sub;//longestsubstring
					}
					
				}
			}
		}
		System.out.println(longest);
	}
	
		
	//palindrome logic
	static boolean ispalindrome(String str) {
		String rev=new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}
}

	
