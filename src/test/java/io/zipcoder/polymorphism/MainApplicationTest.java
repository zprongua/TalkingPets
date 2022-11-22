package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Dog;
import io.zipcoder.polymorphism.pets.Pets;
import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {

    @Test
    public void testMe(){
        MainApplication ma = new MainApplication();
        String name = ma.getName();
        int pets = ma.getHowManyPets();
        String petName = ma.getPetName();
        Pets dog = ma.createPet("dog", name);
        Pets cat = ma.createPet("cat", name);
        Pets frog = ma.createPet("frog", name);
        Pets pet = ma.createPet("", name);

        Assert.assertEquals("", name);
        Assert.assertEquals(1, pets);
        Assert.assertEquals(petName, pet.getPetName());
        Assert.assertEquals("", ma.getSpecies());
}
}
