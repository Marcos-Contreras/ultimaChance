package com.example.laultimachance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Novedades extends AppCompatActivity implements View.OnClickListener {

    Button carritofragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novedades);

        //Carrito
        carritofragment = findViewById(R.id.button1);
        carritofragment.setOnClickListener(this);
    }

    public void descProduct(View view) {
        Intent des = new Intent(this, ProductoBotanas1.class);
        startActivity(des);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button1){
            getSupportFragmentManager().beginTransaction().replace(R.id.scrollView, new Carro()).commit();
        }
    }
}