package com.rsh_engineering.tkachenkoni.app_mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
public class spying {

    @Test
    public void spyingTest(){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> spyingList = Mockito.spy(list);

        spyingList.add(1);
        spyingList.add(2);
        spyingList.add(3);

        Mockito.when(spyingList.size()).thenReturn(25);

        Assert.assertEquals(26, spyingList.size());

    }
}
