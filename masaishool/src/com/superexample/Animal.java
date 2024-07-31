package com.superexample;

public class Animal {
    String name;
    //parent class constructor
    Animal(String name){
        this.name = name;
        System.out.println("Animal constructor called");
    }

    void display(){
        System.out.println("Animal name: " + name);
    }

}
class Dog extends Animal{
    //child class constructor
    Dog(String name){
        super(name);
        System.out.println("Dog constructor called");
    }
    void display(){
        super.display();
        System.out.println("This is dog");
    }
}

