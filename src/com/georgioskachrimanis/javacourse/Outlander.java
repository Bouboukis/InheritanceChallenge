package com.georgioskachrimanis.javacourse;

public class Outlander extends Car{
    private int roadServiceMonths;

    // Constructor
    public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", 6, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    // Getters
    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    // Methods
    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0 ) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(3);
        } else  if (newVelocity  >40 && newVelocity <= 50){
            changeGear(4);
        } else {
            changeGear(5);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}

