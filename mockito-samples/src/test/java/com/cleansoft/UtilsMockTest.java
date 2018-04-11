package com.cleansoft;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utils.class)
public class UtilsMockTest {

    @Test
    public void canMock() {

        PowerMockito.mockStatic(Utils.class);
        BDDMockito.given(Utils.getString()).willReturn("Mousa");

    }
}
