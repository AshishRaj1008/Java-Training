package Day01_1;
//2. Wap to check for palindrome number(N).
import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String [] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=x.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int reminder=n%10;
            sum=(sum*10)+reminder;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(n+" is a palindrome.");
        }
        else {
            System.out.println(n+" is not a palindrome.");
        }

    }
}
