package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog dog = new Dog("Shia Lawoof");

    @Test
    public void testDogName() {
        String expectedName = "Shia Lawoof";
        dog.setName(expectedName);
        String actualName = dog.getName();
        assertEquals(expectedName,actualName);
    }




    @Test
    public void speak() {
        String expectedSpeak = "Woof woof!!";
        String actualSpeak = dog.speak();

        assertEquals(expectedSpeak,actualSpeak);
    }

    @Test
    public void testDogInheritance() {
        Boolean inherits = dog instanceof Pet;
        assertTrue(inherits);
    }
}