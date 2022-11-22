package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Pets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {
    Scanner in = new Scanner(System.in);
    String userName;
    Pets[] pets;
    Map<String, Pets[]> owners = new HashMap<String, Pets[]>();

    public void main(String[] args) {
        userName = askName();
        int numPets = howManyPets();
        pets = new Pets[numPets];
        for (int i=0; i<numPets; i++) {
            String petName = getPetName();
            String species = getSpecies(petName);
            pets[i] = createPet(species);
        }
        System.out.println(printString());
    }

    public String askName() {
        return null;
    }


    public int howManyPets() {
        return 0;
    }

    public String getPetName() {
        return null;
    }

    public String getSpecies(String petName) {
        return null;
    }

    public Pets createPet(String species) {
        return null;
    }

    public String printString() {
        return null;
    }

    public enum petType {
        DOG,
        CAT,
        FROG
    }
}
