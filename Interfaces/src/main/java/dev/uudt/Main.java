package dev.uudt;

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

    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

}
