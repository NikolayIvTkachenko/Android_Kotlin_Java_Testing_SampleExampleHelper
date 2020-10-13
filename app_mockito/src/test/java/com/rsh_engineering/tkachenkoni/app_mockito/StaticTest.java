package com.rsh_engineering.tkachenkoni.app_mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(Server.class)
public class StaticTest {

    @Mock
    Server server;


    @Test
    public void testStatic(){

        EasyServer easyServer = new EasyServer();
        PowerMockito.mockStatic(Server.class);

        PowerMockito.when(Server.sendToServer()).thenReturn(true);

        boolean result = easyServer.sendToServer();

        Assert.assertEquals(true, result);
    }

}
