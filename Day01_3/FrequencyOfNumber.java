package Day01_3;
/*
Q1: Ten numbers are entered from the keyboard into an array.
 The number to be searched is entered through the keyboard by the user.
 Write a function which should get the array as input and a number to be searched.
 This function should return the frequency of a searched number in provided list of numbers.

 */
import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        /*
        Take an array from a user. through Scanner class.
         */
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        /*
        Take a number that you want to search in the array how many times appear in the array.
         */
        System.out.println("enter a number to search in array: ");
        int SearchedNumber=x.nextInt();
        /*
        here frequency is number of repetation of the searched number in array.
         */
        int frequency=0;
        for(int i=0;i<n;i++){
            if(arr[i]==SearchedNumber){
                frequency++;
            }
        }
        /*
        here we are printing the frequency of the searched number. that is taking form the user.
         */
        System.out.println("Frequency Of the Number "+SearchedNumber+" is: "+frequency);
    }
}
