package io.zipcoder.polymorphism.pets;

public class Pets {
    String petName;
    String petSound;

    public Pets() {
        this.petName = "";
        this.petSound = "";
    }

    public Pets(String name, String sound) {
        this.petName = name;
        this.petSound = sound;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String name) {
        this.petName = name;
    }

    public String getPetSound() {
        return petSound;
    }

    public void setPetSound(String petSound) {
        this.petSound = petSound;
    }

    public String speak() {
        return petSound;
    }
}
