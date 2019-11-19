package com.romies.testspi.main;

//This is my class I wanted to test.
public class myclass {
    public int performAdd(final int a, final int b) {
        return AddMethodRetriver.Factory.create().performAddMethod(a, b);
    }
}
