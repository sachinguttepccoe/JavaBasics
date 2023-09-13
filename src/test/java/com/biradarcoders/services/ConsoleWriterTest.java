package com.biradarcoders.services;

import com.biradarcoders.interfaces.Printable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleWriterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Test
    @DisplayName("Given message should print")
    void testDisplayMessage(){
        PrintStream save_out=System.out;
        System.setOut(new PrintStream(outContent));

        String message = "Hello, World.";
        Printable.print(message);
        Assertions.assertEquals(message, outContent.toString().trim());
        System.setOut(save_out);
    }
}
