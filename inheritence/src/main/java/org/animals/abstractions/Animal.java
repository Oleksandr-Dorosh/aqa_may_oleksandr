package org.animals.abstractions;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        setName(name);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Name cannot be null");
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

    public abstract void makeSound();
}
