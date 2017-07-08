package com.example.robertocruzleija.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.robertocruzleija.miprimerapp.objectos.Ubicacion;

public class SecondActivity extends AppCompatActivity {

    private TextView textView, textViewLong, textViewLati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.textView = (TextView) findViewById(R.id.textViewTexto);
        this.textViewLati = (TextView) findViewById(R.id.textViewLatitud);
        this.textViewLong = (TextView) findViewById(R.id.textViewLongitud);
        // obtener lo extras
        Ubicacion ubicacion = (Ubicacion) getIntent().getSerializableExtra("parametro");

        this.textView.setText(ubicacion.getNombre());
        this.textViewLong.setText(""+ubicacion.getLongitud());
        this.textViewLati.setText(""+ubicacion.getLatitud());
    }
}
