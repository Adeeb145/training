package org.sprint2day1;

interface A {
    default void run() {
        System.out.println("Run from A");
    }
}

interface B {
    default void run() {
        System.out.println("Run from B");
    }
}

class MyClass implements A, B {
    @Override
    public void run() {
        A.super.run();
    }
}
public class day1_11 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.run();
    }
}
