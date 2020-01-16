package com.upgrad.oop2;


interface Clickable {
    default void click() {
        System.out.println("click");
    }

    default void print() {
        System.out.println("Clickable");
    }
}


interface Accessible {
    default void access() {
        System.out.println("access");
    }

    default void print() {
        System.out.println("Accessible");
    }
}


public class ButtonDemo implements Clickable, Accessible {

    public void print() {
        Clickable.super.print();
        Accessible.super.print();
    }

    public static void main(String[] args) {
        ButtonDemo button = new ButtonDemo();
        button.click();
        button.access();
        button.print();

        //Clickable.super.print();
    }
}
