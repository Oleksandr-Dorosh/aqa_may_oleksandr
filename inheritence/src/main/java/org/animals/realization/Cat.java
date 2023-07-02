package org.animals.realization;

import org.animals.abstractions.Animal;

public class Cat extends Animal {

    boolean HasSoftWool;

    public Cat(String name, int age,boolean HasSoftWool) {
        super(name, age);
        this.HasSoftWool= HasSoftWool;
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}