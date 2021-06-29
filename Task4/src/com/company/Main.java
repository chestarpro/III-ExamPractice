package com.company;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Chyngyz");
        me.getLeftPocket().add(new Banknote(1000, Currency.EUR));
        me.getRightPocket().add(new Key());
        me.shakePockets();
    }
}
