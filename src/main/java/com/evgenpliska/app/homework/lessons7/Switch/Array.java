package com.evgenpliska.app.homework.lessons7.Switch;

/**
 * Created by User on 18.04.2017.
 */
public class Array {
    public static void Main(String[] args){
        boolean flag = true;
        int a[] = {17, 28, 15};
        while (flag){
            flag = true;
            for(int i =0; i < a.length; i ++){
                if (a[i] > a[i+1]) {
        int b = a[i];
        a[i] = a[i+1];
        a[i+1] = b;
        flag = true;

                }
            }
        }
        System.out.println(" ");
    }
}


