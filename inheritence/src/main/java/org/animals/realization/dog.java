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

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
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
