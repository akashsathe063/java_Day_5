package com.bridgelabz.alphabet;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a Character");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("This is a vowel");

        }
        else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("This is a vowel");
        }
        else{
            System.out.println("This is a Consonant");
        }
    }
}
