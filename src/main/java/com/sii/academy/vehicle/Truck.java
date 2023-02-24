package com.sii.academy.vehicle;

public class Truck extends Vehicle {
    public Truck(int maxVelocity) {
        super(maxVelocity);
    }

    @Override
    public void move() {
        System.out.println("I'am truck, max speed is " + getMaxVelocity());
    }

}
