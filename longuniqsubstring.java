package com.jsp.strings;
import java.util.Scanner;
public class longestuniquesubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String unique=" ";
		int len=0;
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length();j++) {
				String sub=str.substring(i,j);
				//System.out.println(sub);
				if(isunique(sub)) {
					if(sub.length()>len) {
						len=sub.length();
						unique=sub;
					}
					
				}
				
			}
		}
		System.out.println(unique);
		

}
	static boolean isunique(String str){
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					return false;
				}
				
			}
			
		}
		return true;
		
		
	}
}
