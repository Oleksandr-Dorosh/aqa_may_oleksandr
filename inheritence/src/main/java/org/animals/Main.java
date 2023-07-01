package org.animals;

import org.animals.ClassAndObject.Cat;
import org.animals.ClassAndObject.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(1);
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
        dog.showInfo();

        Cat cat = new Cat(2);
        cat.showName();
        cat.eat();
        cat.sleep();
        cat.meow();
        cat.showInfo();

    }

}
