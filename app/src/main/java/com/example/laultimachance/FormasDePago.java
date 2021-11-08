package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormasDePago extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formas_de_pago);
    }
    public void Ingresar (View view){
        Intent ingresarenpaypal = new Intent(this, IngresarPaypal.class);
        startActivity(ingresarenpaypal);
    }
    public void Acceder (View view){
        Intent accedermercadopago = new Intent(this, IngresarMercadopago.class);
        startActivity(accedermercadopago);
    }
}
