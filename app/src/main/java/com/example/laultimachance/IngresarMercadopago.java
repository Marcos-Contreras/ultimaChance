package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngresarMercadopago extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_mercadopago);
    }
    public void ingresarCuentaMercadopago (View view){
        Intent ingresarcuentaenmercadopago = new Intent(this, DentroMercadopago.class);
        startActivity(ingresarcuentaenmercadopago);
    }
}
