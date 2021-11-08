package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngresarPaypal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_paypal);
    }
    public void ingresarCuentaPaypal (View view){
        Intent ingresarcuentaenpaypal = new Intent(this, DentroPaypal.class);
        startActivity(ingresarcuentaenpaypal);
    }
}
