package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Cat;
import io.zipcoder.polymorphism.pets.Dog;
import io.zipcoder.polymorphism.pets.Frog;
import io.zipcoder.polymorphism.pets.Pets;
import org.junit.Assert;
import org.junit.Test;

public class PetsTest {
    @Test
    public void testPets() {
        String expectedName = "Ritter";
        String expectedSound = "Woof";
        Pets pet = new Pets(expectedName, expectedSound);

        Assert.assertEquals(expectedName, pet.getPetName());

        Assert.assertEquals(expectedSound, pet.getPetSound());
    }

    @Test
    public void testModifiers() {
        String expectedName = "Ritter";
        String expectedSound = "Woof";
        Pets pet = new Pets();
        Pets dog = new Dog(expectedName);

        pet.setPetName(expectedName);
        pet.setPetSound(expectedSound);

        Assert.assertEquals(expectedName, pet.getPetName());
        Assert.assertEquals(expectedSound, pet.getPetSound());
        Assert.assertEquals(expectedSound, pet.speak());
    }

    @Test
    public void testDog() {
        Pets dog = new Dog();
        Pets pet = new Dog("Ritter");

        Assert.assertEquals("", dog.getPetName());
        Assert.assertEquals("woof", dog.speak());

        Assert.assertEquals("Ritter", pet.getPetName());
        Assert.assertEquals("woof", pet.speak());
    }

    @Test
    public void testCat() {
        Pets cat = new Cat();
        Pets pet = new Cat("Shotgun");

        Assert.assertEquals("", cat.getPetName());
        Assert.assertEquals("meow", cat.speak());

        Assert.assertEquals("Shotgun", pet.getPetName());
        Assert.assertEquals("meow", pet.speak());
    }

    @Test
    public void testFrog() {
        Pets frog = new Frog();
        Pets pet = new Frog("Prince");

        Assert.assertEquals("", frog.getPetName());
        Assert.assertEquals("ribbit", frog.speak());

        Assert.assertEquals("Prince", pet.getPetName());
        Assert.assertEquals("ribbit", pet.speak());
    }
}
