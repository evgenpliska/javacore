package com.evgenpliska.app.homework.lessons6;

import java.util.Random;

/**
 * Created by User on 29.03.2017.
 */
public class Random999 {
    public static void main(String[] args) {
        int[] intArray = new int[15];
        for (int i = 0; i < intArray.length; i++) {
            Random array = new Random();
            intArray[i] = array.nextInt(1000);
            System.out.print(intArray[i] + " ");
        }
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println(" ");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}


