package day01_5;
/*
1) Create a class Box that uses a method to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth.
The class should have a method that can return the volume of the box.
Create an object of the Box class and test the functionalities.
 */
import java.util.Scanner;

public class Box {
    double h, w, d;

    //to initialize the dimension of the box.
    void Box1(double height, Double width, double depth)
    {
        h = height;
        w = width;
        d = depth;
    }
    double volume()
    {
        double vol = h * w * d;
        return vol;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Hight of the box: ");
        double h = x.nextDouble();
        System.out.println("width of the box: ");
        double w = x.nextDouble();
        System.out.println("depth of the box: ");
        double d = x.nextDouble();

        Box b = new Box();
        b.Box1(h,w,d);
        double v = b.volume();
        System.out.println("Volume of the Box: " + v);
    }

}

