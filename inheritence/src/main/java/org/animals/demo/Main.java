package org.animals.demo;

import org.animals.realization.cat;
import org.animals.realization.dog;
import org.animals.realization.tiger;

public class Main {
    public static void main(String[] args) {
        cat cat = new cat(null,12, true);
        dog dog = new dog("Jessie", 3, true);
        tiger tiger = new tiger("tiger",2,true,true);
        dog.makeSound();
        cat.makeSound();
        tiger.makeSound();

        cat.eat();
        dog.eat();
        tiger.eat();

        System.out.println(tiger.getName());
        System.out.println(dog.getName());
        System.out.println(cat.getName());
    }
}
