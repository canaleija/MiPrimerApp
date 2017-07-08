package com.example.robertocruzleija.miprimerapp.controladorDeEventos;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.robertocruzleija.miprimerapp.MapsActivity;
import com.example.robertocruzleija.miprimerapp.R;
import com.example.robertocruzleija.miprimerapp.SecondActivity;
import com.example.robertocruzleija.miprimerapp.objectos.Ubicacion;

/**
 * Created by Roberto Cruz Leija on 24/06/2017.
 */

public class ControladorBotones implements View.OnClickListener{

    private Context contexto;
    private EditText editTextNombre,editTextLong,editTextLati;
    //private EditText editText;
  private Ubicacion ubicacion;
    public ControladorBotones(Context contexto,EditText editTextNombre,
                               EditText editTextLong, EditText editTextLati) {
        this.contexto = contexto;
        this.editTextLati = editTextLati;
        this.editTextLong = editTextLong;
        this.editTextNombre = editTextNombre;
    }

    @Override
    public void onClick(View v){
        Button boton =(Button) v;
        Intent intento;
        switch (boton.getId()){
            case R.id.btnEjecutarMapa:{
                intento = new Intent(contexto, MapsActivity.class);
                contexto.startActivity(intento);
                break;
                // nada
            }
            case R.id.buttonActividad3:{
                // obtener el valor del edittext para mandarlo a la nueva actividad
                double lat = Double.parseDouble(editTextLati.getText().toString());
                double longitud = Double.parseDouble(editTextLong.getText().toString());
                String nombre = editTextNombre.getText().toString();

                this.ubicacion = new Ubicacion(nombre,longitud,lat);

                intento = new Intent(contexto, SecondActivity.class);
                // agregamos el dato como extra
                intento.putExtra("parametro",ubicacion);
                contexto.startActivity(intento);
                break;
            }
            default:{

            }

        }
    }
}
