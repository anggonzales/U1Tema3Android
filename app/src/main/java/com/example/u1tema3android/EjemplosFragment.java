package com.example.u1tema3android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EjemplosFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplos_fragment);
    }

    public void btn1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void btn2(View view) {
        startActivity(new Intent(this, ListaCorreo.class));
    }

    public void btn3(View view) {
        startActivity(new Intent(this, MainFragmentCorreo.class));
    }
}