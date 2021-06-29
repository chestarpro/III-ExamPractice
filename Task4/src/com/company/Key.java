package com.company;

public class Key extends AbstractThing implements Ringing {
    @Override
    public void ring() {
        System.out.println(toString() + " are ringing! Ding! Ding!");
    }

    @Override
    public String toString() {
        return "Key";
    }
}
