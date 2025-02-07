package com.jsp.strings;

import java.util.Scanner;

public class swaplastandfirstchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		int f=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			//firstword 1st character and remaining word 1st character
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				f=i;
			}
			//lastword last character remaining words last character
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				char temp=ch[f];
				ch[f]=ch[i];
				ch[i]=temp;
			}
		}
		System.out.println(ch);
		

}
}
