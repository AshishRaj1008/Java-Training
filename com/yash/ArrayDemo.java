package com.yash;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter length of arr: ");
        int n=x.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of all elements of arr is: "+sum);
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
                if (arr[i]>max){
                        max=arr[i];
                }
            }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum element is: "+max+" Minimum Element is: "+min);






        //2nd method
      /*  for(int i:arr){
            arr[i]=x.nextInt();
        }
        for(int i:arr){
            sum=sum+arr[i];
        }
        System.out.println(sum);

       */

    }
}
