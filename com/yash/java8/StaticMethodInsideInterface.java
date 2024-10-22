package com.yash.java8;

interface C{
    static void sayHellow() {

    }
}

public class StaticMethodInsideInterface implements C{
    public static void main(String[] args) {
        StaticMethodInsideInterface obj=new StaticMethodInsideInterface();
      //  obj.sayHellow(); //can't call through obj
       // StaticMethodInsideInterface.sayHellow(); //same
        C.sayHellow(); //call through interface nane
    }
}
