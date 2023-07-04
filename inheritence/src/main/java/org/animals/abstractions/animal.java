package org.animals.abstractions;

public abstract class animal {
    String name;
    int age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
        setName(name);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Name can not be null");
        }
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

    public void setAge(int age) {
        this.age = age;
    }


    public abstract void makeSound();
}

