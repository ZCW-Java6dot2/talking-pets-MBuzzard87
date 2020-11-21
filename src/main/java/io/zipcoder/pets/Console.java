package io.zipcoder.pets;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
    }


    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public Integer getIntInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextInt();
    }

    private void println(String prompt, Object[] args) {
        System.out.println(prompt);
    }
}
