package com.bridgelabz.swap;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swap :"+a+" "+b);
        swapNum(a,b);
    }
    public static void swapNum(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap: "+a+" "+b);

    }
}
