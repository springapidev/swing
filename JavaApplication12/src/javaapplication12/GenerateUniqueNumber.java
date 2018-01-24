/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Rajail Islam
 */
public class GenerateUniqueNumber {

    public static void main(String[] args) {
        generateUniqueNumbers(50);
    }

    public static void generateUniqueNumbers(int numOfUniqueNumbers) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size() < numOfUniqueNumbers) {
            set.add(random.nextInt());
        }
        List<Integer> result = new ArrayList<>(set);
        for (int num : result) {
            if (String.valueOf(num).startsWith("-")) {
            } else {
                //Print only positive Number
                System.out.println(num);
            }

        }
    }
}