package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Outlander outlander = new Outlander(36);
        outlander.steer( 128);
        outlander.accelerate( 45);
        outlander.accelerate(20);
        outlander.accelerate(-35);
    }
}
