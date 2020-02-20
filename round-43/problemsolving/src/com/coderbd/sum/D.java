package com.coderbd.sum;

import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        System.out.println("Sum: " + makeSum());
    }

    public static int makeSum() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Some Numbers");
        int num = sc.nextInt();
        while (num > 0) {
            sum += num;
            num = sc.nextInt();

        }
        return sum;
    }
}
