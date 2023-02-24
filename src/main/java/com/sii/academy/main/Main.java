package com.sii.academy.main;

import com.sii.academy.human.Human;
import com.sii.academy.skills.Mobile;
import com.sii.academy.skills.Talkable;
import com.sii.academy.vehicle.Boat;
import com.sii.academy.vehicle.Truck;
import com.sii.academy.vehicle.Vehicle;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var firstTruck = new Truck(122);
        var secondTruck = new Truck(132);
        var firstHuman = new Human(); //Adam:D
        var seondHuman = new Human(); // Jest i Ewa. Cheat god activated. new Earth()(  () -> Creation.execute()).start())
        var firstBoat = new Boat(ThreadLocalRandom.current().nextInt(0, 300));
        var secondBoat = new Boat(ThreadLocalRandom.current().nextInt(0, 300));
        var godsTruck = new Truck(299792458) {
            @Override
            public void move() {
                System.out.printf("I am something more than only super truck. " +
                                "I am Galaxy Force One truck and I travel with C = %s m/s",
                        splitBigIntegerToParts(getMaxVelocity()));
            }

        };

        Mobile godHandmade;
        List<Mobile> myLittleWorld = Arrays.asList(new Mobile[]{firstTruck, secondTruck, firstHuman, seondHuman, firstBoat, secondBoat, godsTruck});
        godHandmade = genericMethod(myLittleWorld);
        godHandmade.move();
    }

    private static void print(Mobile mobile) {
        mobile.move();
    }

    private static void printObjectIdentityMessage(Mobile mobile) {
        if (mobile instanceof Vehicle)
            System.out.printf("The car it is. %d is max speed of it%n", ((Vehicle) mobile).getMaxVelocity());
        else System.out.printf("No, the car it isn't,you fool%n");
    }

    private static void introduce(Talkable talkable) {
        talkable.sayHello("Mateusz");
    }

    private static Mobile genericMethod(List<? extends Mobile> list) {
        list.forEach(Main::printObjectIdentityMessage);
        return list.get(list.size() - 1);
    }

    private static String splitBigIntegerToParts(int integer) {
        String output = String.valueOf(integer);
        if (output.length() < 3) return output;

        StringBuilder modifiedNumber = new StringBuilder();

        IntStream.range(0, output.length()).forEachOrdered(index -> {
            if (index % 3 == 0 && index != 0) modifiedNumber.append(" ");
            modifiedNumber.append(output.toCharArray()[index]);
        });
        return modifiedNumber.toString();

    }
}