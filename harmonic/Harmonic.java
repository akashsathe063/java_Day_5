package com.bridgelabz.harmonic;
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        double result=0.0;
        for(int i=1;i<=num;i++){
            result=result+(double)1/i;

            System.out.println(result);
        }
        // System.out.println(result);
    }
}
