package com.rsh_engineering.tkachenkoni.app_mockito_login.Presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Nikolay Tkachenko on 14, October, 2020
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    private Login.View view;

    @Mock
    private Login.Model model;

    private LoginPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new LoginPresenter(view);
    }

    @Test
    public void shouldShowErrorMessageWhenUserOrPasswordIsWrong() throws Exception{
        when(view.getUserName()).thenReturn("Nikolay0");
        when(view.getPassword()).thenReturn("Android");
        presenter.validateUser(view.getUserName(), view.getPassword());
        verify(view).error();
    }

    @Test
    public void shouldMessageWhenUserOrPasswords() throws Exception{
        when(view.getUserName()).thenReturn("Nikolay");
        when(view.getPassword()).thenReturn("Android");
        presenter.validateUser(view.getUserName(), view.getPassword());
        verify(view).userIdValid();
    }



}