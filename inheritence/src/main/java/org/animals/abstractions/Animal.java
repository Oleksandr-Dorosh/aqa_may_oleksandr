package org.animals.abstractions;

import org.animals.enums.AnimalType;

public abstract class Animal {
    private String name;
    private int age;
    private AnimalType type;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name != null ){
            this.name = name;
        }else {
            System.out.println("Name cannot be null ");
        }
    }

    public String getName() {
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

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
