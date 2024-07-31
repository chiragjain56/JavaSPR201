package com;


public class Airthmatic{
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello Guys");

        try{
            int result = 5/0;
            System.out.println(a[4]);

        }catch (ArithmeticException r){
            System.out.println("Tried to access the out of bound element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getStackTrace());
            System.out.println("Tried to access array bound error");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally block always executed");
        }
        System.out.println("bye guys");
    }
}
