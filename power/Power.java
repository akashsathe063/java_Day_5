package com.bridgelabz.power;

public class Power {
    public static void main(String arg[]){
        int n;
        //Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(arg[0]);
        for(int i=0;i<=n;i++)
        {
            System.out.println(Math.pow(2,i));

        }
    }
}
