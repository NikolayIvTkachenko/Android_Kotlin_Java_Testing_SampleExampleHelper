package com.rsh_engineering.tkachenkoni.app_mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
public class EmailTest {

    @Test
    public void testSendingEmailReturnsEmailBodyV0(){

        Email emailInterface = Mockito.mock(Email.class);
        Mockito.when(emailInterface.getEmailBody()).thenReturn("I test a new program.");
        String body = emailInterface.getEmailBody();
        Assert.assertEquals("I test a new program.", body);

    }

    @Test
    public void testSendingEmailReturnsEmailBodyV1(){

        EmailClient emailClient = new EmailClient();

        Email emailInterface = Mockito.mock(Email.class);

        //new Email(sender, body, attachment, )

        Mockito.when(emailInterface.getEmailBody()).thenReturn("I test a new program.");
        String bodySentBackFromServer = emailClient.sendEmail(emailInterface);
        Assert.assertEquals("I test a new program.", bodySentBackFromServer);

    }

    @Test
    public void testSendingEmailReturnsEmailBodyV2(){

        EmailClient emailClient = new EmailClient();

        EmailClientInterface emailClientInterface = Mockito.mock(EmailClientInterface.class);


        Mockito.when(emailClientInterface.sendEmail(Mockito.isA(Email.class))).thenReturn("I test a new program.");
        String bodySentBackFromServer = emailClient.sendEmail(Mockito.isA(Email.class));
        Assert.assertEquals("No new email.", bodySentBackFromServer);

    }

    @Test
    public void testIfSendingEmailReturnsEmailBodyInfoV3(){

        EmailClient emailClient = new EmailClient();

        Email email = Mockito.mock(Email.class);

        Mockito.when(email.getEmailBody()).thenReturn("I test app test 3");
        emailClient.sendEmail(email);
        //Mockito.verify(email.getAttachedFiles());
        //Mockito.verify(email).getEmailBody();
        Mockito.verify(email, Mockito.times(2)).getAttachedFiles();
        //Mockito.verify(email, Mockito.never()).getAttachedFiles();
        Mockito.verify(email, Mockito.atMost(3)).getAttachedFiles();

    }


}
