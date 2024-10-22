package day01_5;

import java.util.Scanner;

/*
2) Design a class that can be used by a health care professional to keep track
of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),weight(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result.
The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.

 */
class Patient {
    String name="Ashish";
    double h ;
    double w;
    double computeBMI(double h,double w){
        this.h=h;
        this.w=w;
        return w/(h*h);
    }
}
public class Patients {
    public static void main(String[] args) {
        Patient p=new Patient();
        double BMI=p.computeBMI(5.11,65.0);
        System.out.println("Namw of the patient: "+p.name+" and BMI is: "+BMI);
    }
}
