package com.georgioskachrimanis.javacourse;

public class Car extends Vehicle{

    private int gears;
    private int wheels;
    private int doors;
    private boolean isManual;

    private int currentGear;

    // Constructors

    public Car(String name, String size, int gears, int wheels, int doors, boolean isManual) {
        super(name, size);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    // Getters and Setters


    // Methods


    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear() was called: Changed to gear " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }


}
