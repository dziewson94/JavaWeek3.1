package com.sii.academy.vehicle;

import com.sii.academy.skills.Mobile;

public abstract class Vehicle implements Mobile {
    private int maxVelocity;

    public Vehicle(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    @Override
    public void move() {
        System.out.println("My max speed is " + maxVelocity);
    }
}
