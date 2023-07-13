package org.animals.abstractions;

import org.animals.enums.AnimalName;
import org.animals.enums.AnimalType;

public abstract class Animal {
    private AnimalName name;
    private int age;
    private AnimalType type;

    public Animal(AnimalName name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = AnimalName.valueOf(name);
        } else {
            System.out.println("Name cannot be null");
        }
    }


    public AnimalName getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("I am eating...");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public AnimalType getType() {
        return type;
    }


    public abstract void makeSound();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
