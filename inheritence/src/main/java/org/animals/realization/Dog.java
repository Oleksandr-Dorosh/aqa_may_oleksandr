package org.animals.realization;

import org.animals.abstractions.Animal;
import org.animals.enums.AnimalName;

public final class Dog extends Animal {
    private boolean hasHardWool;

    public Dog(String name, int age, boolean hasHardWool) {
        super(AnimalName.valueOf(name), age);
        this.hasHardWool = hasHardWool;
    }

    public void setHasHardWool(boolean hasHardWool) {
        this.hasHardWool = hasHardWool;
    }

    public boolean isHasHardWool() {
        return hasHardWool;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
            return "Name: " + getName() + ", Age: " +getAge() + ", Type: " + getType();
        }
}
