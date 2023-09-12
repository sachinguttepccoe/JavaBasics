package com.javabasics.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class JavaStdIOTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n4\n5".getBytes());


    @Test
    @DisplayName("Should read input from standard input and print to standard output")
    void displayScannerInput(){
        PrintStream ps = new PrintStream(outContent);
        JavaStdIO javaStdIOObj = new JavaStdIO(inputStream, ps);
        javaStdIOObj.displayScannerInput();
        String outputText = outContent.toString();
        Assertions.assertEquals("3\n4\n5", outputText.trim());

    }

}
