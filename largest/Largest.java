package com.bridgelabz.largest;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("a= "+a);
        b=sc.nextInt();
        System.out.println("b= "+b);
        c=sc.nextInt();
        System.out.println("c= "+c);
        if(a>b)
        {
            if(a>c) {
                System.out.println("A is largest number: " + a);
            }
            else{
                System.out.println("C is largest number: "+c);
            }
        }
        else{
            if(b>c)
            {
                System.out.println("B is largest number: "+b);
            }
            else{
                System.out.println("C is largest number: "+c);
            }
        }
    }
}
