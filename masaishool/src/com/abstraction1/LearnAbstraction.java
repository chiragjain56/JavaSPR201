package com.abstraction1;


abstract class Animal {
    //Abstract method (does not have body)
    abstract void sound();

    abstract void walk();

    //Reguler method , concrete method
    public void eat() {
        System.out.println("eating...");
    }
}


//-----------------------------------------------------------------------------
class Dog extends Animal {

    void sound() {
        System.out.println("the dog is barking...");
    }

    void walk() {
        System.out.println("dog is walking...");
    }

    //concrete method
    public void fetch() {
        System.out.println("The dog fetches the ball.");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("cat is meowing..");
    }

    @Override
    void walk() {
        System.out.println("cat is running..");
    }
}

//------------------------------------------------------------------------------
public class LearnAbstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.fetch();
        dog.sound();
        dog.eat();
        dog.walk();
    }
}
