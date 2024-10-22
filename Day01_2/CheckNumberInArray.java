package Day01_2;

import java.util.Scanner;

/*1)Write a program to initialize an integer array with values and
check if a given number is present in the array or not.
*/
public class CheckNumberInArray {
    public static int CheckNumber(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        System.out.println("Enter any number to check in arr: ");
        int num=x.nextInt();
        int result=CheckNumber(arr,num);
        System.out.println(result);
    }
}




