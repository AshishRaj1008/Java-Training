package com.yash.training;

public class GeneratePrime {
    public static void main(String args [])
    {
        int a=10;
        int flag=0;
        for(int i=2;i<a;i++){
            for(int j=2;j<i/2;j++)
            {
                if(i%j!=0)
                {

                    flag=i;
                    //System.out.println(flag+" ");
                }
                System.out.println(flag);
            }
        }
    }
}
