package com.jsp.strings;

import java.util.Scanner;
public class replacespaceswithA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String r="";
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==' ') {
				r+="A";
			}
			else {
				r+=str.charAt(i);
			}
		}
		System.out.println(r);
		

}
}
