package com.jsp.strings;
import java.util.Scanner;

public class sumofdigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string");
			String str=sc.next();
			int sum=0;
			for(int i=0;i<=str.length()-1;i++) {
				char ch=str.charAt(i);
				if(ch>='0'&&ch<='9') {
					sum+=(ch-48);
				}
				}
			System.out.println(sum);
	}

}
