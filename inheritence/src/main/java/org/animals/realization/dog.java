package org.animals.realization;

import org.animals.abstractions.animal;

public final class dog extends animal {

    private boolean hasHardWool;
    private int age;
    private String name;

    public dog(String name, int age, boolean hasHardWool) {
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
        System.out.println("bark");
    }
}
