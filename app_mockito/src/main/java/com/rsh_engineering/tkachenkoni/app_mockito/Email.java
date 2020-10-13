package com.rsh_engineering.tkachenkoni.app_mockito;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
public interface Email {

    String getEmailBody();
    String getSender();
    String[] getAttachedFiles();

}
