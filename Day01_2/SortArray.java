package Day01_2;

import java.util.Scanner;

/*
3. Write a program to initialize an array and print them in a sorted order(ascending)
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
