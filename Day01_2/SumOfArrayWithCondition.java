package Day01_2;

import java.util.Scanner;

public class SumOfArrayWithCondition {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        int sum=0;
        boolean add=true;
        for(int i=0;i<n;i++){
            if((arr[i]!=6) && (add==true)) {
                sum = sum + arr[i];
            }
               else if(arr[i]==6)
                    add=false;
                else if (arr[i]==7)
                    add=true;
            }
        System.out.println(sum);

    }

    }



