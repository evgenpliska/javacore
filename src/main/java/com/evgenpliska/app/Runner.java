package com.evgenpliska.app;

/**
 * Created by User on 02.02.2017.
 */
public class Runner {
        public static void main(String[] arge){
            WideningCasting casting1 = new WideningCasting();
            casting1.widening();

            NarrowingCasting narrowing1 = new NarrowingCasting();
            narrowing1.narrowing();
        }
    }

