package org.animals.abstractions;

public abstract class animal {
    String name;
    int age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("i am eating...");
    }

    public abstract void makeSound();
}

