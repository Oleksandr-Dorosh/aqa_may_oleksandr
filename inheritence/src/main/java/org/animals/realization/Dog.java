package org.animals.realization;

import org.animals.abstractions.Animal;

public class Dog extends Animal {

    boolean HasHardWool;

    public Dog(String name, int age, boolean HasHardWool) {
        super(name, age);
        this.HasHardWool = HasHardWool;
    }

    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
