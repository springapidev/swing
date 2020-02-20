package com.coderbd.prime;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Total Prime Numbers: " + getPrimeCount(2, 100));
    }

    public static int getPrimeCount(int num1, int num2) {
        int counter = 0;
        if (num1 < num2) {
            while (num1 <= num2) {
                if (isPrime(num1)) {
                    counter++;
                }
                num1++;
            }
        } else {
            while (num1 >= num2) {
                if (isPrime(num1)) {
                    counter++;
                }
                num1--;
            }
        }
        return counter;
    }

    public static int getPrecedingsPrime(int num) {
        int expectedPrimeNum = 0;
        while (num - 1 >= 2) {
            if (isPrime(num)) {
                expectedPrimeNum = num;
                break;
            }
            num--;
        }
        return expectedPrimeNum;
    }

    public static boolean isPrime(int num) {
        boolean status = num > 1;
        int i = 2;

        while (i <= num / 2) {
            if (num % i == 0) {
                status = false;
                break;
            }
            i++;
        }
        return status;
    }
}
