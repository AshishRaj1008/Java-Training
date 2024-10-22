package Day01_2;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        int UniqueArray[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                UniqueArray[j++]=arr[i];
            }
        }
        UniqueArray[j++]=arr[n-1];

        for(int i=0;i<j;i++){
            arr[i]=UniqueArray[i];
        }
        for(int i=0;i<UniqueArray.length;i++){
            System.out.print(UniqueArray[i]+" ");
        }

        
    }
}
