package com.rsh_engineering.tkachenkoni.app_mockito_login.Presenter;

/**
 * Created by Nikolay Tkachenko on 14, October, 2020
 */
;public interface Login {

    interface View{
        void userIdValid();
        void error();
        String getUserName();
        String getPassword();
    }

    interface Presenter {
        void validateUser(String user, String pass);
        void useridValid();
        void error();

    }

    interface Model {
        void validUser(String user, String pass);
    }

}
