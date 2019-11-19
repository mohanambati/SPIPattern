package com.romies.testspi.main;

import com.romies.testspi.main.mock.MockAddMethodRetriverImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class myclassTest {

    @Test
    public void testPerformAdd1() {
        final myclass instance = new myclass();
        MockAddMethodRetriverImpl.setMyResult(999);
        assertEquals(999, instance.performAdd(1, 1));
    }

    @Test
    public void testPerformAdd2() {
        final myclass instance = new myclass();
        MockAddMethodRetriverImpl.setMyResult(89);
        assertEquals(89, instance.performAdd(1, 1));
    }
}
