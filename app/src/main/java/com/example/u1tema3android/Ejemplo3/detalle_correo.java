package com.example.u1tema3android.Ejemplo3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.u1tema3android.R;

public class detalle_correo extends AppCompatActivity {
    TextView txtde;
    TextView tasunto;
    TextView ttexto;
    TextView ttodo;
    String de;
    String texto;
    String asunto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        Bundle extras = getIntent().getExtras();
        de= extras.getString("de");
        texto= extras.getString("texto");
        asunto = extras.getString("asunto");
        ttodo=findViewById(R.id.txtdetalle);


        txtde=findViewById(R.id.txtde);
        ttexto=findViewById(R.id.txttexto);
        tasunto=findViewById(R.id.txtasunto);

        txtde.setText(de);
        ttexto.setText(texto);
        tasunto.setText(asunto);

        ttodo.setText(de + " " + asunto +" " + "" + texto);





    }
}
