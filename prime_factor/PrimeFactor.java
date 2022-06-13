package com.bridgelabz.prime_factor;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String arg[]) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 2; i * i < n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
        if (n != 1) {

            System.out.println(n);
        }
    }
}