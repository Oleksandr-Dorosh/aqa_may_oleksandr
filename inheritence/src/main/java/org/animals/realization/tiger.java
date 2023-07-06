package org.animals.realization;

import org.animals.abstractions.animal;

public class tiger extends cat {

    private boolean predator;

    public tiger(String name, int age, boolean hasWool, boolean predator) {
        super(name, age, hasWool);
        this.predator = predator;
    }

    public void setPredator(boolean predator) {
        this.predator =predator;
    }

    public boolean isPredator() {
        return predator;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}
