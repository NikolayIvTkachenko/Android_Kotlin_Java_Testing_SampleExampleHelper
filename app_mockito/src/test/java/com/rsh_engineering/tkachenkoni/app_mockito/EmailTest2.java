package com.rsh_engineering.tkachenkoni.app_mockito;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
public class EmailTest2 {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    EmailClientInterface emailClient;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    public final void doesLoginHappenBeforeLogout(){
        InOrder inOrder = Mockito.inOrder(emailClient);


        emailClient.login();
        emailClient.logout();

        inOrder.verify(emailClient).login();
        inOrder.verify(emailClient).logout();
    }

    @Test
    public final void shouldContainCertainListItem(){
        InOrder inOrder = Mockito.inOrder(emailClient);


        emailClient.login();
        emailClient.logout();

        inOrder.verify(emailClient).login();
        inOrder.verify(emailClient).logout();
    }
}
