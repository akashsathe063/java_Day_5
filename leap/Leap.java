package com.bridgelabz.leap;

import java.util.Scanner;

public class Leap {
    public static void main(String arg[]){
        System.out.println("Enter a Year");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%400==0)
        {
            System.out.println("This is a Leap Year: "+n);

        }
        else if(n%100==0)
        {
            System.out.println("This is not leap year: "+n);

        }
        else if(n%4==0)
        {
            System.out.println("This is leap Year: "+n);

        }
        else {
            System.out.println("This is not leap year");
        }
    }
}
