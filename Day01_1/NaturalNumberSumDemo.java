package Day01_1;

/*
we are create a NaturalNumberSumDemo class which having a method that is calculateSum
method which return sum of natural number which is divisible by 3 and 5.
 */
import java.util.Scanner;

public class NaturalNumberSumDemo {
    /*
    here we created a method that is calculateSum. it returns sum of natural number which is
    divisible by r 3 and 5.
    return sum as an integer.
     */
    public static int calculateSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        /*
        here we take a number form user and call a method that is calculateSum with pass
        a argument that is integer.
         */
        System.out.println("Enter a Number: ");
        int n=x.nextInt();
          int sum=  calculateSum(n);
          /*
          here after return the integer then store the value in sum  variable and the print
          the value as an output.
           */
        System.out.println("sum of first "+n+" with divisible by 3 or 5 is: "+sum);
    }
}
