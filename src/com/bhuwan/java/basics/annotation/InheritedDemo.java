package com.bhuwan.java.basics.annotation;

public class InheritedDemo {

    public static void main(String[] args) {
        Child c = new Child();
        MethodInfo info = c.getClass().getAnnotation(MethodInfo.class);
        System.out.println(info.author() + " --- " + info.comments() + " --- " + info.date() + " --- " + info.revision());
    }

}

@MethodInfo(author = "Bhuwan", comments = "Comments", revision = 12)
class Parent {

}

class Child extends Parent {

}
