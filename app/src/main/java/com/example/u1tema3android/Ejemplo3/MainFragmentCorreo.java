package com.example.u1tema3android.Ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.u1tema3android.Ejemplo3.DetalleCorreoFragment;
import com.example.u1tema3android.R;

public class MainFragmentCorreo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_correo);
    }
    public void mostrarDetalle(String texto, String de, String asunto) {
        ((DetalleCorreoFragment)getSupportFragmentManager()
                .findFragmentById(R.id.FrgDetalle)).mostrarDetalle(texto, de , asunto);
    }
}
