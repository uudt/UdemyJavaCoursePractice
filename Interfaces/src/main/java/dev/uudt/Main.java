package dev.uudt;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();

        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

//        bird.move();
        animal.move();
        // these methods are not declared in interfaces
//        flier.move();
//        tracked.move();

        flier.takeOff();
        flier.fly();
        flier.land();
        tracked.track();

    }
}
