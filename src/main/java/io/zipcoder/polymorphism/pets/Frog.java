package io.zipcoder.polymorphism.pets;

public class Frog extends Pets {
    final String sound = "ribbit";

    public Frog(String name) {
        super(name, "ribbit");
    }

    public Frog() {
        super("", "ribbit");
    }

    public String speak() {
        return sound;
    }
}
