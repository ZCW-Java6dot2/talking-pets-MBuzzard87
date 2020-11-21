package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void speak() {
        Pet pet = new Pet("");
        String expectedSpeak = "Cawww";
        String acutalSpeak = pet.speak();
        assertEquals(expectedSpeak,acutalSpeak);
    }
}