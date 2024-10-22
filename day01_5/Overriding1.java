package day01_5;
/*
1)Create  a base class Fruit with name ,taste and size as its attributes.
Create a method called eat() which describes the name of the fruit and its taste.
Inherit the same in 2 other classes Apple and Orange and override the eat() method
to represent each fruit taste.
 */
class Fruit{
    String name;
    String taste;
    String size;
    void eat(){
        System.out.println("Name of the Fruit is: ");
        System.out.println("Taste of the Fruit is: ");
    }
}
class Apple extends Fruit{
    Apple(String name,String taste){
        this.name=name;
        this.taste=taste;
    }
    @Override
    void eat(){
        System.out.println("the name of the fruit is: "+name+" the taste of the fruit is: "+taste);
   }
}
class Orange extends Fruit{

  Orange(String name,String taste){
      this.name=name;
      this.taste=taste;
  }
  @Override
  void eat(){
      System.out.println("the name of the fruit is: "+name+" the taste of the fruit is: "+taste);
  }
}
public class Overriding1 {
    public static void main(String[] args) {
        Apple a=new Apple("apple","Sweet");
        Orange o=new Orange("Orange","Sour");
        a.eat();
        o.eat();
    }
}
