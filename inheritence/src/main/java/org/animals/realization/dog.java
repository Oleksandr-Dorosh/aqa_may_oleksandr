package org.animals.realization;

import org.animals.abstractions.animal;

public class dog extends animal {

    boolean hasHardWool;

    public dog(String name, int age, boolean hasHardWool) {
        super(name, age);
        this.hasHardWool = hasHardWool;
    }

    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
