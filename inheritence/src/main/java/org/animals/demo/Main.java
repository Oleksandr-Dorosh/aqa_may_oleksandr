package org.animals.demo;

import org.animals.realization.Cat;
import org.animals.realization.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Lu",12, true);
        Dog dog = new Dog("Jessie", 3, true);
        dog.makeSound();
        cat.makeSound();
        cat.eat();
        dog.eat();
        System.out.println(dog.getName());
        System.out.println(cat.getName());

    }
}
