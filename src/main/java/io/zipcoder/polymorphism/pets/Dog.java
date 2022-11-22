package io.zipcoder.polymorphism.pets;

public class Dog extends Pets {
    final String sound = "woof";

    public Dog(String name) {
        super(name, "woof");
    }

    public Dog() {
        super("", "woof");
    }

    public String speak() {
        return sound;
    }
}
