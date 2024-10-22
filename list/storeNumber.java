package list;
/*
2)Create an ArrayList that can store only numbers like
 int,float,double,etc, but not any other data type.
 */
import java.util.ArrayList;
import java.util.Objects;

public class storeNumber {
    public static void main(String[] args) {
        ArrayList<Number> arr=new ArrayList<>();
        arr.add(10);
        arr.add(15.22);
        arr.add(15.5f);
        //arr.add("ashish");
        System.out.println(arr);


    }
}
