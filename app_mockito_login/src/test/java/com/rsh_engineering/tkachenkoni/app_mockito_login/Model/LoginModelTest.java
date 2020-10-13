package com.rsh_engineering.tkachenkoni.app_mockito_login.Model;

import com.rsh_engineering.tkachenkoni.app_mockito_login.Presenter.Login;
import com.rsh_engineering.tkachenkoni.app_mockito_login.Presenter.LoginPresenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by Nikolay Tkachenko on 14, October, 2020
 */

@RunWith(MockitoJUnitRunner.class)
public class LoginModelTest {

    @Mock
    private Login.Presenter presenter;

    private LoginModel model;

    @Before
    public void setUp() throws Exception {
        model = new LoginModel(presenter);

    }

    @Test
    public void shouldSuccesWithValidUserAndPass(){
        model.validUser("Nikolay", "Android");
        verify(presenter).useridValid();

    }

    @Test
    public void shouldNotSuccesWithUserAndPass() throws Exception{
        model.validUser("John", "1234");
        verify(presenter).error();
    }


    @Test
    public void validUserFaild() {
        model.validUser("Tom", "Android");
        verify(presenter).useridValid();
    }



}