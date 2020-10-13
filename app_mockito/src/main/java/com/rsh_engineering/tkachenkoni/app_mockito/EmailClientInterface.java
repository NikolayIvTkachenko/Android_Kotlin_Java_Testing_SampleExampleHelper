package com.rsh_engineering.tkachenkoni.app_mockito;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */

public interface EmailClientInterface {
    String sendEmail(Email email);
    String login();
    String logout();
}
