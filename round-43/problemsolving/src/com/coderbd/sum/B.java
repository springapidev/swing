/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.sum;

/**
 *
 * @author Students
 */
public class B {

    public static void main(String[] args) {
        makeSum(1, 10);
    }

    public static void makeSum(int startNum, int endNum) {
        int sum = 0;
        while (startNum <= endNum) {
            sum += startNum;
            startNum++;
        }
        System.out.println("Sum: " + sum);
    }
}
