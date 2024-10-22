package Day01_1;
/*Write a program that should ask a number from user.
You need to display all the prime numbers till that number. For exam : 25*/
import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String [] args){
        Scanner x =new Scanner(System.in);
        System.out.println("Enter a Number for range to print Prime NO:-");
        int n=x.nextInt();
        int flag=0;
        for(int i=2;i<=n;i++)
        {
            flag=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag++;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(i+" ");
            }
        }

    }
}
