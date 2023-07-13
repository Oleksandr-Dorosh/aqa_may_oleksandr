package org.animals.demo;

import org.animals.realization.Cat;
import org.animals.realization.Dog;
import org.animals.realization.Tiger;
import org.animals.enums.AnimalType;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 12, true);
        cat.setType(AnimalType.DOMESTIC);
        Dog dog = new Dog("Dog", 3, true);
        dog.setType(AnimalType.DOMESTIC);
        Tiger tiger = new Tiger("Tiger", 2, true, true);
        tiger.setType(AnimalType.WILD);

        dog.makeSound();
        cat.makeSound();
        tiger.makeSound();

        cat.eat();
        dog.eat();
        tiger.eat();

        System.out.println(tiger.toString());
        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }
}
