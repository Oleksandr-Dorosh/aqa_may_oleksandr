package org.animals.realization;

import org.animals.abstractions.Animal;

public class Cat extends Animal {
    private boolean hasSoftWool;

    public Cat(String name, int age, boolean hasSoftWool) {
        super(name, age);
        this.hasSoftWool = hasSoftWool;
    }

    public void setHasSoftWool(boolean hasSoftWool) {
        this.hasSoftWool = hasSoftWool;
    }

    public boolean isHasSoftWool() {
        return hasSoftWool;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow ");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " +getAge() + ", Type: " + getType();
    }
}
