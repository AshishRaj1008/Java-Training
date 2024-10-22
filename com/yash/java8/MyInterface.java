package com.yash.java8;
//functional Interface
@FunctionalInterface
public interface MyInterface {
    public void  sayHello();    //this is single abstract function.
    default void sayBay(){      //not an abstract method.
    };
    public static void sayOk(){

    };
}
