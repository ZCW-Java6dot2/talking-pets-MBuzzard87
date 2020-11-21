package io.zipcoder.pets;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PetList {
    Console console = new Console(System.in, System.out);
    Scanner scan = new Scanner(System.in);

    public Integer howMany() {
        return console.getIntInput("How many pets do you have?");
    }


    public String ownerName() {
        return console.getStringInput("Hi, what is your name?");
    }

    public String petName() {
        return console.getStringInput("pet's name please?");
    }

    public Integer petType() {
        return console.getIntInput("Can you tell me what kind of pet this one is? \n" +
                "Press 1 for Cat\n" +
                "Press 2 for Dog\n" +
                "Press 3 for Chicken");
    }

    public ArrayList<Pet> petInfo() {
        ArrayList<Pet> pet = new ArrayList<Pet>();
        Integer petNum = howMany();
        String name = "";
        for (int i = 0; i < petNum; i++) {
            switch (petType()) {
                case 1:
                    petName();
                    name = scan.nextLine();
                    Cat cat = new Cat(name);
                    pet.add(cat);
                    break;
                case 2:
                    petName();
                    name = scan.nextLine();
                    Dog dog = new Dog(name);
                    pet.add(dog);
                    break;
                case 3:
                    petName();
                    name = scan.nextLine();
                    Chicken chicken = new Chicken(name);
                    pet.add(chicken);
                    break;
                default:
                    System.out.print("Please enter a valid number to register your pet");
                    break;
            }
        }
        return pet;
    }


    public void printOwnerAndPet() {

        System.out.print("Hello, " + ownerName() + " thank you for registering with Buzzworth Farms where 'It's not trustworthy, unless it's Buzzworthy'." +
                "  We need register your pets.\n");
        for(Pet yourPet : petInfo()) {
            System.out.print("Your pet " + yourPet.getName() + " is excited to see you and let out a " + yourPet.speak() + "!!!\n");
        }
    }
}
