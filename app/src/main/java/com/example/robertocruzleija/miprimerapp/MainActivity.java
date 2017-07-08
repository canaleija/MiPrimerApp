package com.example.robertocruzleija.miprimerapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.robertocruzleija.miprimerapp.controladorDeEventos.ControladorBotones;
import com.example.robertocruzleija.miprimerapp.objectos.Ubicacion;

public class MainActivity extends AppCompatActivity {

    private EditText editText,editTextLong,editTextLat;
    private Button boton,boton3;
    private Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inflando la actividad con el layout que le corresponde
        setContentView(R.layout.activity_main);
        generarReferenciasViews();
        Toast mensaje =   Toast.makeText(this,"Se ejecuto el metodo onCreate",Toast.LENGTH_SHORT);
        mensaje.show();
    }

    private void generarReferenciasViews() {
        // generamos las referencias de los diferentes views
        this.contexto = this;
        editText = (EditText)findViewById(R.id.editText);
        boton = (Button)findViewById(R.id.btnEjecutarMapa);
        boton3 = (Button) findViewById(R.id.buttonActividad3);
        editTextLat = (EditText) findViewById(R.id.editTextLatitud);
        editTextLong = (EditText) findViewById(R.id.editTextLong);

                ControladorBotones cb = new ControladorBotones(contexto,editText,editTextLong,editTextLat);
        boton.setOnClickListener(cb);
        boton3.setOnClickListener(cb);
        /*
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // crear el intento que nos ejecute la SecondActivity
                Intent intento = new Intent(contexto,SecondActivity.class);
                contexto.startActivity(intento);
            }
        });
        */
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast mensaje =   Toast.makeText(this,"Se ejecuto el metodo onResume",Toast.LENGTH_SHORT);
        mensaje.show();
    }


    public void botonPresionado (View view){

        Toast mensaje =   Toast.makeText(this,"Se presionó el boton",Toast.LENGTH_SHORT);
        mensaje.show();

    }
}
