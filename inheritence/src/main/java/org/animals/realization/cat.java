package org.animals.realization;

import org.animals.abstractions.animal;

public class cat extends animal {

    boolean hasSoftWool;

    public cat(String name, int age, boolean hasSoftWool) {
        super(name, age);
        this.hasSoftWool= hasSoftWool;
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}