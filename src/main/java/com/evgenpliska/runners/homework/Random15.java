package com.evgenpliska.runners.homework;

import java.util.Random;

/**
 * Created by User on 29.03.2017.
 */
public class Random15 {
    public static void main(String[] args) {
        int a = 0;
        int[] intArray = new int[15];
        for (int i = 0; i<intArray.length; i++){
            Random array = new Random();
            intArray[i] = array.nextInt(10);
            System.out.print(intArray[i]+" ");
            if (intArray[i]%2==0){a++;}
        }
        System.out.println(" ");
        System.out.print("Q-ty of even numbers equal to: " + a);
    }
}

}
