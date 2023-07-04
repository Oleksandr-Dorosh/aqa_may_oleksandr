package org.animals.demo;

import org.animals.realization.cat;
import org.animals.realization.dog;

public class Main {
    public static void main(String[] args) {
        cat cat = new cat("Lu",12, true);
        dog dog = new dog("Jessie", 3, true);
        dog.makeSound();
        cat.makeSound();
        cat.eat();
        dog.eat();
        System.out.println(dog.getName());
        System.out.println(cat.getName());

    }
}
