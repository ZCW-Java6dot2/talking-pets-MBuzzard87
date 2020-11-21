package io.zipcoder.pets;

public class Chicken extends Pet{



    public Chicken(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Cluck cluck";
    }


}
