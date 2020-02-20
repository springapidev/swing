package com.coderbd;

public class Casting {

    private static int x = 10;

    public static void main(String[] args) {
        boolean status = x >= 10 ? true : x != 10 ? true : x < 5 ? true : false;
        System.out.println(status);
    }
}
