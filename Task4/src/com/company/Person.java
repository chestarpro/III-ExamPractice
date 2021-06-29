package com.company;

import java.util.HashSet;
import java.util.Set;

public class Person extends AbstractHuman {
    private String name;
    private final Set<AbstractThing> leftPocket = new HashSet<>();
    private final Set<AbstractThing> rightPocket = new HashSet<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AbstractThing> getLeftPocket() {
        return leftPocket;
    }

    public Set<AbstractThing> getRightPocket() {
        return rightPocket;
    }

    public void shakePockets() {
        for (AbstractThing abstractThing : leftPocket) {
            if(abstractThing instanceof Paperable) {
                ((Paperable) abstractThing).bend();
            }
            if(abstractThing instanceof Ringing) {
                ((Ringing) abstractThing).ring();
            }
        }
        for (AbstractThing abstractThing : rightPocket) {
            if(abstractThing instanceof Paperable) {
                ((Paperable) abstractThing).bend();
            }
            if(abstractThing instanceof Ringing) {
                ((Ringing) abstractThing).ring();
            }
        }
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}
