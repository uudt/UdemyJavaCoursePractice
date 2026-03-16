package dev.uudt;

interface FlightEnabled {

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
