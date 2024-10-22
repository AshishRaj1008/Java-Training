package Day01_1;

import java.util.Scanner;

//4.Create a method to find the sum of the cubes of the digits of an n digit number.
public class SumOfCube {
    public static int SumOfCubeOfDigit(int n){
       int sum=0;
       while(n>0){
           int mod=n%10;
           sum= sum+(int) (Math.pow(mod,3));
           n=n/10;
       }
       return sum;

    }
    public static void main(String args [])
    {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=x.nextInt();
        int sumOfCubeOfDigits=SumOfCubeOfDigit(n);
        System.out.println(sumOfCubeOfDigits);
    }
}
