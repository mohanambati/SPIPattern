package com.romies.testspi.main.mock;

import com.romies.testspi.main.AddMethodRetriver;

public class MockAddMethodRetriverImpl implements AddMethodRetriver {

    private static int result;

    @Override
    public int performAddMethod(int a, int b) {
        return result;
    }

    public static void setMyResult(final int val) {
        result = val;
    }
}
