package Day01_1;
//Wap to print Fibonacci series(Upto N).
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter the range for fibonacci Numbers: ");
        int range=x.nextInt();
        int firstTerm=0;
        int secondTerm=1;

        for(int i=0;i<=range;i++)
        {
            System.out.print(firstTerm+" ");

            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
