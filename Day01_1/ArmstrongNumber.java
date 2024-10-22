package Day01_1;

import java.util.Scanner;

//Wap to check for Armstrong number(N).
public class ArmstrongNumber {
    public static int countNumber(int originalNumber){
       int count=0;
        while(originalNumber>0){
            int rem=originalNumber/10;
           count++;
        }
        return count;
    }

    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=x.nextInt();
        int rem=0;
        int originalNumber=n;
        int result=0;
        int NoOfDidit=countNumber(originalNumber);
        while(originalNumber>0){
            rem=originalNumber%10;
            result= (int) (result+Math.pow(rem,NoOfDidit));
            originalNumber=originalNumber/10;
        }

        if(result==n)
        {
            System.out.println(n+" is a armstrong Number.");
        }
        else {
            System.out.println(n+" is not a armstrong Number.");
        }

    }
}
