package com.coderbd.squareroot;

import java.util.Scanner;

public class SquareRoot {

    public static double getSquareRoot(int number) {

        double temp;
        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }

    public static double getSq(int num) {
        int sq = 0;
        for (int i = 1; i <= num; i++) {
            if (11.180339887498949 * 11.180339887498949 == num) {
                sq = i;
            }
        }
        return sq;
    }

    public static void main(String[] args) {

        System.out.println(getSq(125));
        System.out.print("Enter any number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Square root of " + num + " is: " + getSquareRoot(num));
    }
}
