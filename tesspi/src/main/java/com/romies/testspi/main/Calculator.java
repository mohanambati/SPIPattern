package com.romies.testspi.main;

public class Calculator {
    public static int add(final int a, final int b) {
        if(a == 0 && b== 0) {
            return 0;
        }
        return a + b;
    }
}
