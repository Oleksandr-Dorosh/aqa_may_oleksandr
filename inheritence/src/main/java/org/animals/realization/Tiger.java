package org.animals.realization;

import org.animals.abstractions.Animal;

public class Tiger extends Cat {
    private boolean predator;

    public Tiger(String name, int age, boolean hasWool, boolean predator) {
        super(name, age, hasWool);
        this.predator = predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public boolean isPredator() {
        return predator;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar ");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " +getAge() + ", Type: " + getType();
    }
}
