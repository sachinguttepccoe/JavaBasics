package com.biradarcoders.services;

import java.io.PrintStream;

public class ConsoleOutput {

    private static final PrintStream printStream = new PrintStream(System.out);

    public static void printInt(){
        printStream.println(ConsoleInput.getInt());
    }

    public static void printString(){
        printStream.println(ConsoleInput.getString());
    }

    public static void printStringLine(){
        printStream.println(ConsoleInput.getStringLine());
    }
}
