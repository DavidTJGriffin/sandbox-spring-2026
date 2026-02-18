package org.example.sandbox.exception;

import java.util.Scanner;

public class HelloException {
    public static void main(String[] args) {

        // try-catch block to handle exceptions
        try {
            // do something that may throw an exception
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // do something else

        // try-catch-catch block to handle multiple exceptions
        try {
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occured: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("An exception occured: " + e.getMessage());
        }

        // try-catch-finally block to ensure some code always runs
        try {
        } catch (Exception e) {
            System.out.println("An exception occured: " + e.getMessage());
        } finally {
            System.out.println("This will always run, regardless of exceptions.");
        }

        // do something else

        //try-finally block to ensure some code always runs, even without catch
        try {
            // do something that may throw an exception
        } finally {
            System.out.println("This will always run, even if an exception is thrown.");
        }

        // java 7 multi-catch block to handle multiple exceptions in a single catch
        try {
            // do something that may throw an exception
        } catch (NullPointerException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("An exception occured: " + e.getMessage());
        }

        // try-with-resources block to automatically close resources
        try (Scanner scanner = new Scanner(System.in)) {
            // do something with the scanner that may throw an exception
        }
        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
            // do something with the scanner that may throw an exception
        } finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }
    }
}
