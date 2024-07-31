package com.learnInterface;

interface Animal {
    int Legs = 4;

    void eat();

    void walk();

    void drinks();

}

interface human {
    void cry();

    void run();

    void drinks();
}

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.cry();
        monkey.run();
        monkey.eat();
        monkey.walk();
        monkey.drinks();
        System.out.println(Animal.Legs);
    }
}

class Monkey implements human, Animal {

    public void eat() {
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void cry() {
        System.out.println("crying...");
    }

    public void run() {
        System.out.println("running...");
    }

    public void drinks() {
        System.out.println("drinking...");
    }
}
