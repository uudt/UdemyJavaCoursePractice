package dev.uudt;

interface FlightEnabled {

    // fields in interfaces are public static final by default (declared as constants)
    // specifying public static final is redundant
    public static final double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    public abstract void takeOff();

    void land();

    // in interface there is no need to use public abstract keywords since
    // all interfaces methods implicitly declared both public and abstract
    // so they're public and abstract by default
    void fly();

}

interface Trackable {

    void track();

}

public abstract class Animal {

    public abstract void move();

}
