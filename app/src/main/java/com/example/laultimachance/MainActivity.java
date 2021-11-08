package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_LaUltimaChance);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnToLogin(View view) {
        Intent toLogin = new Intent(this, Login.class);
        startActivity(toLogin);
    }

    public void btnToRegister(View view) {
        Intent toRegister = new Intent(this, Register.class);
        startActivity(toRegister);
    }
}