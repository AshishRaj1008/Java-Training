package list;
/*
1) Write a Java program to create an ArrayList,
 add all the months of a year and print the same.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MonthsOfYear {
    public static void main(String[] args) {
        ArrayList<String> months=new ArrayList<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");


       // for(String month :months){
            System.out.println(months);
        //}
    }
}
