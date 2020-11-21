package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest extends TestCase {
    Chicken chicken = new Chicken("Fred");

    @Test
    public void testChickenName() {
        String expectedName = "Fred";
        chicken.setName(expectedName);
        String actualName = chicken.getName();
        assertEquals(expectedName,actualName);
    }

    @Test
    public void testSpeak() {
        String expectedSpeak = "Cluck cluck";
        String actualSpeak = chicken.speak();
        assertEquals(expectedSpeak,actualSpeak);
    }

    @Test
    public void testChickenInheritance() {
        Boolean inherits = chicken instanceof Pet;
        assertTrue(inherits);
    }
}