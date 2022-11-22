package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Cat;
import io.zipcoder.polymorphism.pets.Dog;
import io.zipcoder.polymorphism.pets.Frog;
import io.zipcoder.polymorphism.pets.Pets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {
    Scanner in = new Scanner(System.in);
    String userName = "";
    int numPets = 1;
    String petName = "";
    String species = "";
    Pets[] pets;
    Map<String, Pets[]> owners = new HashMap<String, Pets[]>();

    public void main(String[] args) {
        getInfo1();
        pets = new Pets[numPets];
        for (int i=0; i<numPets; i++) {
            getInfo2();
            pets[i] = createPet(species, petName);
        }
        owners.put(userName, pets);
        System.out.println(printString());
    }

    public void getInfo1() {
        System.out.println("What is your name?");
        userName = in.nextLine();
        System.out.println("How many pets do you have?");
        numPets = Integer.parseInt(in.nextLine());
    }

    public void getInfo2() {
        System.out.println("What is your pet's name?");
        petName = in.nextLine();
        System.out.println("What kind of pet is "+petName+"?");
        petName = in.nextLine();
    }

    public String getName() {
        return userName;
    }

    public int getHowManyPets() {
        return numPets;
    }

    public String getPetName() {
        return petName;
    }

    public String getSpecies() {
        return species;
    }

    public Pets createPet(String species, String petName) {
        Pets pet = new Pets();
        if (species.equalsIgnoreCase("dog")) {
            pet = new Dog(petName);
        }
        else if (species.equalsIgnoreCase("cat")) {
            pet = new Cat(petName);
        }
        else if (species.equalsIgnoreCase("frog")) {
            pet = new Frog(petName);
        }
        else {
            System.out.println("Species not supported");
        }
        return pet;
    }

    public String printString() {
        String vocab = "";
        if (numPets==1) { vocab = "pet"; }
        else { vocab = "pets"; }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s owns %s %s.", userName, numPets, vocab));
        for (Pets p : pets) {
            sb.append(String.format("%s is a %s.", p.getPetName(), getSpecies()));
        }
        return sb.toString();
    }
}
