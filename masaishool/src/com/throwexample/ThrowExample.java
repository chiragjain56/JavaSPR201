package com.throwexample;

public class ThrowExample {
    public static void validateAge(int age) {

        if (age < 18) {
            ArithmeticException e = new ArithmeticException(" not allowed");
            throw e;
//            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible for vote");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(12);
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }


        System.out.println("rest of the code");
    }
}
