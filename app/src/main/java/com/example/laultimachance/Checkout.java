package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    }

    public void btnCompraFinalizada(View view) {
        Intent toCompraFinalizada = new Intent(this, CompraFinalizada.class);
        startActivity(toCompraFinalizada);
    }
}