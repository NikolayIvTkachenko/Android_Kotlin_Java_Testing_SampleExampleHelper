package com.rsh_engineering.tkachenkoni.appusetestingsample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
public class PasswordTest {

    @Test
    public void shouldHaveMoreThanSixCymbols(){
        Assert.assertEquals(PasswordUtil.isStrongPassword("A1"), false);
        Assert.assertEquals(PasswordUtil.isStrongPassword("Mode12"), false);
        Assert.assertEquals(PasswordUtil.isStrongPassword("NickProgrammer123"), true);
    }

}
