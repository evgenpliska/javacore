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
    public char intToChar (int myInt){
        return (char) myInt;
    }

    public void intToChar(){
        System.out.println("Input int value is "+ myInt + ". Output char value is " + myChar);
    }

    public int charToInt(char myChar){
        return (int) myChar;
    }

    public void charToInt(){
        System.out.println("Input char value is "+ myChar + ". Output int value is " + myInt);
    }
}

