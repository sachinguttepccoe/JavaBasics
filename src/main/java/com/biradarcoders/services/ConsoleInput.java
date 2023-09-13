package com.biradarcoders.services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {

    private static final Scanner scanner = new Scanner(System.in);;

    public static int getInt() throws InputMismatchException {
        System.out.print("Please Enter Only Integer : ");
        return scanner.nextInt();
    }

    public static String getString() throws InputMismatchException {
        System.out.print("Please Enter Only One String  : ");
        return scanner.next();
    }

    public static String getStringLine() throws InputMismatchException {
        System.out.print("Please Enter String Line  : ");
        return scanner.nextLine();
    }
}
