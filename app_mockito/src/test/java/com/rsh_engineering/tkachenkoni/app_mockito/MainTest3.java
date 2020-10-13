package com.rsh_engineering.tkachenkoni.app_mockito;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
public class MainTest3 {

    @Test
    public void testIntentShouldBeCreated(){
        Context context = Mockito.mock(Context.class);
        Intent intent = MainActivity.crateIntent(context, "ted");
        Assert.assertNotNull(intent);

        Bundle bundle = getIntentExtras(intent);
        Assert.assertEquals("ted", bundle.getString("USERNAME"));

    }

    private Bundle getIntentExtras(Intent intent){
        Bundle bundle = intent.getExtras();
        return bundle;
    }
}
