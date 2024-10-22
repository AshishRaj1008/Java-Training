package day01_5;
/*
1) Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods.
 Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
 */

class Animal{
   void eat(){
       System.out.println("eat method from Animal class. ");

    }
    void sleep(){
        System.out.println("sleep method form Animal class.");
    }
}
class Bird extends Animal{
  @Override
  void eat(){
      System.out.println("eat method form Bird class.");
  }
  void sleep(){
      System.out.println("sleep method from bird class.");
  }
  void fly(){
      System.out.println("fly method form bird class.");
    }
}

public class Inheritance01 {
    public static void main(String[] args) {
        Bird B=new Bird();
        Animal A=new Animal();
        A.eat();
        A.sleep();
        B.eat();
        B.fly();
        B.sleep();
    }

}
