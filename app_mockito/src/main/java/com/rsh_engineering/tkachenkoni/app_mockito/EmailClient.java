package com.rsh_engineering.tkachenkoni.app_mockito;

/**
 * Created by Nikolay Tkachenko on 13, October, 2020
 */
class EmailClient implements EmailClientInterface {

    public String sendEmail(Email email){
        String emailbody;
        try {
            email.getAttachedFiles();
            email.getAttachedFiles();
            emailbody = email.getEmailBody();
        }catch (NullPointerException e){
            emailbody = "No new email.";
        }
        return emailbody;
    }

    @Override
    public String login() {
        return "Login";
    }

    @Override
    public String logout() {
        return "Logout";
    }

}
