package com.abstraction;

class LearnAbstract {
    public static void main(String[] args) {
        Car car = new Car();

        car.setName("audi");
        System.out.println(car.name);
//        car.brakes(4);
        System.out.println(car.brakes(4));
        car.drive();
    }
}

//--------------------------------------------------------------------
abstract public class Vehicle {
    String name;

    //constructor
    void setName(String name) {
        this.name = name;
    }

    abstract void drive();

    abstract int brakes(int wheels);
}

//--------------------------------------------------------------------
class Car extends Vehicle {


    void drive() {
        System.out.println("car is driving...");
    }

    int brakes(int wheels) {
        System.out.println(" brakes are applied...");
        return wheels;
    }
}