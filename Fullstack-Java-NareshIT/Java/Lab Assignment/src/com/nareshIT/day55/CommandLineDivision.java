package com.nareshIT.day55;

public class CommandLineDivision {

    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Exactly two integer arguments required.");
            }

            try {
                int dividend = Integer.parseInt(args[0]);
                int divisor = Integer.parseInt(args[1]);

                try {
                    double result = (double) dividend / divisor;
                    System.out.println("Division result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic error: " + e.getMessage());
                }

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } finally {
            System.out.println("Division operation completed.");
        }
    }
}
