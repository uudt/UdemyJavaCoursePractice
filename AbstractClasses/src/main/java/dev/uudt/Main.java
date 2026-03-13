package dev.uudt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        can't create an instance of an abstract class
//        Animal animal = new Animal("animal", "big", 100);
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

//        Array of animals: objects of its subclasses - dogs, fishes
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }

    }

//    method works with animal subclasses objects
    public static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }


}
