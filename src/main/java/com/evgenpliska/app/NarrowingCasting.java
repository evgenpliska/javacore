package com.evgenpliska.app;

/**
 * Created by User on 02.02.2017.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowing(){
        int1 = (int)float1;
        System.out.println(int1);
    }
}
