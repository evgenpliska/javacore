package com.evgenpliska.runners.homework;

import java.util.Random;

/**
 * Created by User on 29.03.2017.
 */
public class DoubleArray {
    public static void main(String[] args) {
        int[][] intArray = new int[8][5];
        for (int i = 0; i < intArray.length; i++){
            for (int k = 0; k < intArray[i].length; k++){
                Random array = new Random();
                intArray[i][k] = array.nextInt(90)+10;
                System.out.print(intArray[i][k] + " ");
            }
            System.out.println(" ");
        }
    }
}

}
