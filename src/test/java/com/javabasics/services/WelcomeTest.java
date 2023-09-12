package com.javabasics.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WelcomeTest {

    public final Welcome welcome= new Welcome();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Test
    @DisplayName("Given message should print")
    void testDisplayMessage(){
        PrintStream save_out=System.out;
        System.setOut(new PrintStream(outContent));

        String message = "Hello, World.";
        welcome.displayMessage(message);
        Assertions.assertEquals(message, outContent.toString().trim());

        System.setOut(save_out);
    }
}
