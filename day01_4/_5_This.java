package day01_4;

//This keyword is used to pass an argument in the constructor call
class B{
    A4 obj;
    B(A4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of day01_4.A4 class
    }
}

class A4 {
    int data = 10;

    A4() {
        B b = new B(this);
        b.display();
    }
}
public class _5_This {
    public static void main(String[] args)
        {
            A4 a=new A4();

        }
}
