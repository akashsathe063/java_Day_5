package com.bridgelabz.even_odd;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String arg[])
    {
        System.out.println("Enter a number");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       //int a = (n%2==0)? System.out.println("This is Even Number: "+n):System.out.println("This is odd Number: "+n);
       if(n%2==0)
        {

            System.out.println("This is Even Number: "+n);
        }
        else {

            System.out.println("This is odd Number: "+n);
        }
    }
}
