package com.sii.academy.human;

import com.sii.academy.skills.Mobile;
import com.sii.academy.skills.Talkable;

public class Human implements Mobile, Talkable {
    @Override
    public void move() {
        System.out.println("Im human I can run with 13km/h");

    }

    @Override
    public void sayHello(String message) {
        System.out.printf("Hello, nice to meet you %s", message);
    }
}
