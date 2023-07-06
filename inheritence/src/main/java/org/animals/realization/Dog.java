package org.animals.realization;

import org.animals.abstractions.Animal;

public final class Dog extends Animal {
    private boolean hasHardWool;

    public Dog(String name, int age, boolean hasHardWool) {
        super(name, age);
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
}
