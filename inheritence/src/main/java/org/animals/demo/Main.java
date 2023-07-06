package org.animals.demo;

import org.animals.realization.Cat;
import org.animals.realization.Dog;
import org.animals.realization.Tiger;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(null, 12, true);
        Dog dog = new Dog("Jessie", 3, true);
        Tiger tiger = new Tiger("Tiger", 2, true, true);
        dog.makeSound();
        cat.makeSound();
        tiger.makeSound();

        cat.eat();
        dog.eat();
        tiger.eat();

        System.out.println(tiger.getName());
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        System.out.println(tiger.getAge());
    }
}
