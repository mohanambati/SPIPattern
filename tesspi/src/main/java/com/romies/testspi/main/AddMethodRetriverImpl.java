package com.romies.testspi.main;

public class AddMethodRetriverImpl implements AddMethodRetriver {

    @Override
    public int performAddMethod(int a, int b) {
        return Calculator.add(a,b);
    }
}
