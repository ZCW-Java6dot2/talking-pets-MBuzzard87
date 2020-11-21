package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat cat = new Cat("Frank");

    @Test
    public void testCatName() {
        String expectedName = "Frank";
        cat.setName(expectedName);
        String actualName = cat.getName();
        assertEquals(expectedName,actualName);
    }


    @Test
    public void speak() {
        String expectedSpeak = "Meow";
        String actualSpeak = cat.speak();
        assertEquals(expectedSpeak,actualSpeak);
    }

    @Test
    public void testCatInheritance() {
        Boolean inherits = cat instanceof Pet;
        assertTrue(inherits);
    }
}