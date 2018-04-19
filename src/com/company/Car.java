package com.company;

public class Car {
    private String name;
    private String color;
    private int year;

    // car constructor
     Car(String n, String c, int y) {
        name = n;
        color = c;
        year = y;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
