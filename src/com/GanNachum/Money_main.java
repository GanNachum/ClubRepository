package com.GanNachum;

public class Money_main {
    public static void main(String[] args) {
        Money money = new Money(40);
        System.out.println(money.getValue());
        money.setValue(50);
        System.out.println(money.getValue());
    }
}
