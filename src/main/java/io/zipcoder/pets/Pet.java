package io.zipcoder.pets;

public class Pet {
    private String name;
    private String speak = "Cawww";

    public Pet(String name) {
        this.name = name;
    }

    public String speak() {
        return this.speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
