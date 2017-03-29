package com.evgenpliska.runners.homework;

/**
 * Created by User on 29.03.2017.
 */
public class OddArray {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i<=99; i++){
            if (i%2!=0){ a++;}    //% делит левый операнд на правый операнд и возвращает остаток; 7/2 = 1, 8/2 = 0
        }

        int[] intArray = new int[a];
        for (int i = 1, k = 1; i<intArray.length; i++, k += 2){
            intArray[i] = k;
            System.out.print(intArray[i]+" ");
        }

        System.out.println(" ");

        for (int i=a-1; i > 0; i--){
            System.out.print(intArray[i]+" ");
        }
    }
}

}
