package org.animals.realization;

import org.animals.abstractions.animal;

public class cat extends animal {

    private boolean hasSoftWool;
    private String name;
    private int age;

    public cat(String name, int age, boolean hasSoftWool) {
        super(name, age);
        this.hasSoftWool= hasSoftWool;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void setHasSoftWool(boolean hasSoftWool) {
        this.hasSoftWool = hasSoftWool;
    }

    public boolean isHasSoftWool() {
        return hasSoftWool;
    }
}