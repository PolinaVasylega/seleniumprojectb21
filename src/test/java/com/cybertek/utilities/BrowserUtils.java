package com.cybertek.utilities;

/*
We will create utility methods for repeated steps that can be used
in browsers, and store in this class.
 */

public class BrowserUtils {

    //create method name: wait
    //converting milliseconds to seconds
    //handle checked exception

    public static void sleep(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");
            e.printStackTrace();
        }
    }
}
//  BrowserUtility.sleep(3); in main method