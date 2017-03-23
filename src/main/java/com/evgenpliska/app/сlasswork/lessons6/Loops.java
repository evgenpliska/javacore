package com.evgenpliska.app.сlasswork.lessons6;

/**
 * Created by User on 23.03.2017.
 */
public class Loops {
    public static String decrease(int a, int b) {
        while(a > b ) {
            a -= a ;
            System.out.println(a);
            System.out.println(b);
        }

        if (a <= b) {
            System.out.println(a);
            System.out.println(b);
        }
        return "Complete";

    }
}
