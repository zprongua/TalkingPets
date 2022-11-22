package io.zipcoder.polymorphism.pets;

public class Cat extends Pets {
    final String sound = "meow";

    public Cat(String name) {
        super(name, "meow");
    }

    public Cat() {
        super("", "meow");
    }

    public String speak() {
        return sound;
    }
}
