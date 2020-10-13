package com.rsh_engineering.tkachenkoni.app_mockito_login.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rsh_engineering.tkachenkoni.app_mockito_login.Presenter.Login;
import com.rsh_engineering.tkachenkoni.app_mockito_login.Presenter.LoginPresenter;
import com.rsh_engineering.tkachenkoni.app_mockito_login.R;

public class LoginActivity extends AppCompatActivity implements Login.View{

    private EditText user, pass;
    private Login.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.edUser);
        pass = (EditText)findViewById(R.id.edPass);

        presenter = new LoginPresenter(this);

    }

    public void login(View view) {

    }

    @Override
    public void userIdValid() {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    @Override
    public void error() {
        Toast.makeText(this, "User input error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUserName() {
        return user.getText().toString();
    }

    @Override
    public String getPassword() {
        return pass.getText().toString();
    }


}