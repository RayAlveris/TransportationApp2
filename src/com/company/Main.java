package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Car c1 = new Car("Toyota","blue",2016);
        System.out.println( "c1 is " + c1 );

        Car c2 = new Car( "Lexus", "Red", 2018 );
        System.out.println( "c2 is " + c2 );

    }
}
