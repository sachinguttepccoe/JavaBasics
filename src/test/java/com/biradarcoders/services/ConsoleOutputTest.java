package com.biradarcoders.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleOutputTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    @DisplayName("Should read input from standard input and print to standard output")
    void displayScannerInput(){
        ConsoleInput.getInt();
        String outputText = outContent.toString();
        Assertions.assertEquals("3\n4\n5", outputText.trim());

    }

}
