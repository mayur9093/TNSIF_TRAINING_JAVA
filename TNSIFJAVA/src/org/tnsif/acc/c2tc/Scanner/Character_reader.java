package org.tnsif.acc.c2tc.Scanner;

import java.util.Scanner;

public class Character_reader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name :");
        String  Name = sc.nextLine();
        System.out.println(Name);
        char c  = Name.charAt(1);
        System.out.println(c); 
        sc.close();
        
    }   
}
