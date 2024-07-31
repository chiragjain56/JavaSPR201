package com.learninterface1;

public interface Animal {
    void eat();

    void walk();
}

interface human {
    void cry();

    void run();
}

interface Lion {
    void play();

    void hunt();
}

class Dog implements Animal, human, Lion {
    @Override
    public void eat() {
        System.out.println("dog is eating...");
    }

    @Override
    public void walk() {
        System.out.println("dog is walking...");
    }

    @Override
    public void cry() {
        System.out.println("my dog is crying...");
    }

    @Override
    public void run() {
        System.out.println("my dog is running...");
    }

    @Override
    public void play() {
        System.out.println("dog is playing..");
    }

    @Override
    public void hunt() {
        System.out.println("dog is hunting..");
    }
}

class LearnInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.cry();
        dog.run();
        dog.play();
        dog.hunt();
    }
}
