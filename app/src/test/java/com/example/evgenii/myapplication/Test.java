package com.example.evgenii.myapplication;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Evgenii Iashin on 12.12.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(SecondActivity.TestFinalClass.class)
public class Test {

    @org.junit.Test
    public void testOne() {
        SecondActivity.TestFinalClass context = PowerMockito.mock(SecondActivity.TestFinalClass.class);
        assertNotNull(context);
    }
}
