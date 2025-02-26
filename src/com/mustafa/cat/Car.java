package com.mustafa.cat;

public class Car {

    //default constructor => hidden empty parameterless constructor
    public Car(){
        System.out.println("Car Constructor");
    }


    //Attributes - Properties

    double Speed;
    String Color;
    String Model;

    // Methods

    void turnOn(){
        System.out.println("Car is being Turning on");
    }

    void turnOff(){
        System.out.println("Car is being Turning off");
    }

    void brake(){
        System.out.println("Car is being Braking");
    }

    @Override
    public String toString() {
        return "Car Color = " + Color + " Model = " + Model + " Speed = " + Speed;
    }
}
