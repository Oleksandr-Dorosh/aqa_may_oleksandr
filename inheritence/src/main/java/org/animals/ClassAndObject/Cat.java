package org.animals.ClassAndObject;

import org.animals.ClassAndObject.Animal;
import org.animals.interfaces.Info;

public class Cat extends Animal implements Info {
    public int id;
    public Cat(int id){
        this.id = id;
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void meow(){
        System.out.println("Cat is meowing");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
    public void showName(){
        System.out.println("Cat's name :" + catName);
    }
    public void showInfo(){
        System.out.println("id is:"+this.id);
    }
}
