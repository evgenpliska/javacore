package com.evgenpliska.app.utils.convertors;

/**
 * Created by User on 02.02.2017.
 */
//public class PrimitiveConvertor {
public class PrimitiveConvertor {
    float myFloat = 1f;
    char myChar = 'v';
    int myInt = 50;

    public char floatToChar(float myFloat){
        return (char) myFloat;
    }

    public void floatToChar(){
        System.out.println("Input float value is "+ myFloat + ". Output char value is " + myChar);
    }
}