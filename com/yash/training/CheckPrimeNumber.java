package com.yash.training;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a=x.nextInt();
        int flag=0;
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0) {
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println(a+" is a prime No");
        }
        else{
            System.out.println(a+" is not a prime.");
        }
    }
}
