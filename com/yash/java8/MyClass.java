package com.yash.java8;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

interface A{
  default void sayHellow(){
      System.out.println("Hello");
     }
}
interface B{
   default void sayHellow(){
        System.out.println(" B says Hello");
    }
}

public class MyClass implements A, B {
    public static void main(String[] args) {
        MyClass b = new MyClass();
        b.sayHellow();
    }

    @Override
    public void sayHellow() {
        B.super.sayHellow();
    }
}
