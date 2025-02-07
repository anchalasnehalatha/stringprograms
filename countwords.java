package com.jsp.strings;
import java.util.Scanner;
public class countthewords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		//char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(i==0 && str.charAt(i)!=' ' ||str.charAt(i)!=' '&&str.charAt(i-1)==' ') {
				count++;
				
			}
			
			
		}
		System.out.println(count);
		

}
}
