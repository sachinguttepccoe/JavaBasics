package com.biradarcoders.interfaces;

public interface Printable {

    static void printNextLine(String message){
        System.out.println(message);
    }

    static void print(String message){
        System.out.print(message);
    }

}
