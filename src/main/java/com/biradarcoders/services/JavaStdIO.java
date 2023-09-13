package com.biradarcoders.services;

import java.io.PrintStream;
import java.io.InputStream;
import java.util.Scanner;

public class JavaStdIO {

    private Scanner scanner;
    private PrintStream printStream;

    public JavaStdIO(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public void displayScannerInput(){
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int thirdInput = scanner.nextInt();

        printStream.println(firstInput);
        printStream.println(secondInput);
        printStream.println(thirdInput);
    }
}
