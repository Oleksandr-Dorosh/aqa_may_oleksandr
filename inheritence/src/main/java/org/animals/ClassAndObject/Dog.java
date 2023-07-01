package org.animals.ClassAndObject;

import org.animals.ClassAndObject.Animal;
import org.animals.interfaces.Info;

public class Dog extends Animal implements Info {
    public int id;
    public Dog(int id){
        this.id = id;
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    public void showName(){
        System.out.println("Dog's name :" + dogName);
    }
    public void showInfo(){
        System.out.println("Id is:"+this.id);
    }
}
