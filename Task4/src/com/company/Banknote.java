package com.company;

public class Banknote extends AbstractThing implements Paperable {
    private int much;
    private final Currency currency;

    public Banknote(int much, Currency currency) {
        this.much = much;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getMuch() {
        return much;
    }

    public void setMuch(int much) {
        this.much = much;
    }

    @Override
    public void burn() {
        System.out.println("Burn " + toString());
    }

    @Override
    public void bend() {
        System.out.println("Bend " + toString());
    }

    @Override
    public String toString() {
        return much + " " + currency;
    }
}
