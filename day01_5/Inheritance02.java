package day01_5;
/*
2) Create a College application with a class called Person.
Create name and dateOfBirth as member variables.
Create a class called Teacher that inherits from the Person class.
 The teacher will have additional properties like salary, and the subject that the teacher teaches.
Create a class called Student that inherits from Person class.
This class will have a member variable called studentId.
Create a class called College Student that inherits from Student class.
This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.
Create objects of each of this classes, invoke and test the methods that are available in these classes.

 */
class Person{
    String name;
    String dateOfBirth;
}
class Teacher extends Person{
    int salary;
    String Subject;

}
class Student extends Person{
    int studentId;
}
class CollegeStudent extends Student{
    String collegeName;
    String yearOfStudent;
}
public class Inheritance02 {
    public static void main(String[] args) {
        //Person P=new Person();
        Teacher T=new Teacher();
        //Student S=new Student();
        CollegeStudent C=new CollegeStudent();
        C.collegeName="Bharati Vidyapeeth Pune";
        C.yearOfStudent="Fourth Year";
        C.studentId=1814110018;
        C.name="Ashish Raj";
        C.dateOfBirth="08-09-2000";
        System.out.println("Name: "+C.name);
        System.out.println("Student ID: "+C.studentId);
        System.out.println("Date of Birth: "+C.dateOfBirth);
        System.out.println("Year Of Student in College: "+C.yearOfStudent);
        System.out.println("College Name: "+C.collegeName);
        System.out.println();

        T.salary=50000;
        T.Subject="Spring Boot";
        T.name="Patil Sir";
        T.dateOfBirth="01-01-1980";
        System.out.println("Name of Teacher: "+T.name);
        System.out.println("Subject of Teacher: "+T.Subject);
        System.out.println("Salary of the teacher: "+T.salary);
        System.out.println("Date of birth of the teacher: "+T.dateOfBirth);

    }

}

