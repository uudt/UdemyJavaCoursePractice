package dev.uudt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();

        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        // Part 1
////        bird.move();
//        animal.move();
//        // these methods are not declared in interfaces
////        flier.move();
////        tracked.move();
//
//        flier.takeOff();
//        flier.fly();
//        flier.land();
//        tracked.track();

        // Part 2
        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        // there is no such thing as instance fields on an interface
        // access interface field (constant) using type name and field name
        double kmsTravelled = 100;
        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck travelled %.2f km or %.2f miles%n",
            kmsTravelled, milesTravelled);

//        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);
        // ArrayList implements List interface
        // it's recommended to use interface types as the reference type (best practice)
//        List<FlightEnabled> betterFliers = new ArrayList<>();
        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);


    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.land();
        }
    }

}
