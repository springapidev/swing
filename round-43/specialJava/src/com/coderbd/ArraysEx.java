package com.coderbd;

import java.util.Arrays;

public class ArraysEx {

    public static void main(String[] args) {
        int[] x = {2, 5, 7, 8, 10};
        System.out.println(Arrays.toString(x));
        // Array element can be changed
        x[1]=2000;
         System.out.println(Arrays.toString(x));
    }
}
