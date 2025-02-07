package com.jsp.strings;
import java.util.Hashset;
import java.util.Scanner;

public class panagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();  // Close the scanner to prevent resource leaks

        if (ispanagram(str)) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }

    static boolean ispanagram(String str) {
        Hashset<Character> hs = new Hashset<>(); 
        str = str.toLowerCase();  

        for (int i = 0; i < str.length(); i++) {  
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { 
                hs.add(ch);
            }
        }
        return hs.size() == 26;
    }
}
