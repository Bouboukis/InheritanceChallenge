package com.georgioskachrimanis.javacourse;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    // Constructors
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    // Methods

    public void steer(int direction) {
        this.currentDirection +=direction;
        System.out.println("Vehicle.steer() was called: Steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move was called: Moving at " + currentVelocity
                + " towards direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

}
