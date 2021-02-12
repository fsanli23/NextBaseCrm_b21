package com.nextBaseCrm.utilities;

public class BrowserUtils {
    public static void sleep(int second) {
        second *= 1000l;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something is wrong in the sleep method.");
        }
    }


}
