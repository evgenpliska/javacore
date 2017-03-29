package com.evgenpliska.runners.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 29.03.2017.
 */
public class ScunnerNumbers {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        System.out.println("You can enter set of numbers and get sum in the end; To stop, please enter \"Exit\"");
        System.out.println(" ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.print("Please enter number: ");
            String number = reader.readLine();
            if (number.equals("Exit")) break;
            else sum = sum + Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}

}
