package Day01_3;
/*
Q2: Write a program to copy the contents of one array into another array in the reverse order,
 without using any inbuilt method.
 */
import java.lang.annotation.Documented;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        /*
        we are taking an array from user.
         */
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        /*
        here define a new array so that assign the values one by one through original array
        from last element to first element.
         */
        int ReverseArr[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ReverseArr[j]=arr[i];
            j++;
        }
        /*
        Here we are printing the reverse array one by one element.
         */
        System.out.print("Reverse Array: ");
        for(int i=0;i<n;i++) {
            System.out.print(+ReverseArr[i]+" ");
        }
    }
}
