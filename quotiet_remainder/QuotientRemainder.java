package com.bridgelabz.quotiet_remainder;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Dividend;
        int Divisor;
        System.out.println("Enter a Dividend");
       Dividend=sc.nextInt();
        System.out.println("Enter a Divisor");
       Divisor=sc.nextInt();
       double Quotient=(double)Dividend/Divisor;
        System.out.println("this is Quotient: "+Quotient);
        int Remainder=Dividend%Divisor;
        System.out.println("this is Remainder: "+Remainder);
    }
}
