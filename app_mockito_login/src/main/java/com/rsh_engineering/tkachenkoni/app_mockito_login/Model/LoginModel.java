package com.rsh_engineering.tkachenkoni.app_mockito_login.Model;

import com.rsh_engineering.tkachenkoni.app_mockito_login.Presenter.Login;

/**
 * Created by Nikolay Tkachenko on 14, October, 2020
 */
public class LoginModel implements Login.Model {

    private Login.Presenter presenter;

    public LoginModel(Login.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void validUser(String user, String pass) {
        if (user.equals("Nikolay") && pass.equals("Android")){
            presenter.useridValid();
        }else{
            presenter.error();
        }
    }
}
