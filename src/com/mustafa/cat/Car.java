package com.mustafa.cat;

public class Car {

    //default constructor => hidden empty parameterless constructor
    public Car(String model) {
        Model = model;
    }

    double Speed;

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public boolean isHatchBack() {
        return IsHatchBack;
    }

    public void setHatchBack(boolean hatchBack) {
        IsHatchBack = hatchBack;
    }

    String Color;
    String Model;
    boolean IsHatchBack;

    //Attributes - Properties



    // Methods

    void turnOn() {
        System.out.println("Car is being Turning on");
    }

    void turnOff() {
        System.out.println("Car is being Turning off");
    }

    void brake() {
        System.out.println("Car is being Braking");
    }


}
