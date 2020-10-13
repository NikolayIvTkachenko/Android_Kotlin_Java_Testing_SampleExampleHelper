package com.rsh_engineering.tkachenkoni.app_mockito_login.Presenter;

import com.rsh_engineering.tkachenkoni.app_mockito_login.Model.LoginModel;

/**
 * Created by Nikolay Tkachenko on 14, October, 2020
 */
public class LoginPresenter implements Login.Presenter {

    private Login.View view;
    private Login.Model model;

    public LoginPresenter(Login.View view){
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void validateUser(String user, String pass) {
        if (view != null){
            model.validUser(user, pass);
        }
    }

    @Override
    public void useridValid() {
        if (view != null){
            view.userIdValid();
        }
    }

    @Override
    public void error() {
        if (view != null){
            view.error();
        }
    }



}
