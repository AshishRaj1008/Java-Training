package com.yash.training;

public class perfectNumber {
    public static void main(String args[])
    {
        int n=50;
        int sum=0;

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(i==sum){
                System.out.println(i+" ");
            }
            sum=0;
        }
    }
}
