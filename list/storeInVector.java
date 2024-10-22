package list;

import java.util.ArrayList;
import java.util.Vector;

public class storeInVector {
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


        Vector<String> monthsVector=new Vector<>(months);
        System.out.println("months of the Year: ");
        for(String month: monthsVector){
            System.out.println(month);
        }

    }
}
