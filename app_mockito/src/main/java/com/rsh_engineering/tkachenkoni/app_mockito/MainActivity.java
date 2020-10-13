package com.rsh_engineering.tkachenkoni.app_mockito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static Intent crateIntent(Context context, String username){
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("USERNAME", username);
        return i;
    }
}
