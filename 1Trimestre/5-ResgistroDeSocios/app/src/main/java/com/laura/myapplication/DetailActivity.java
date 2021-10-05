package com.laura.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView nombreSocio = findViewById(R.id.tvNombre);
        TextView  apellidoSocio= findViewById(R.id.tvApellido);
        TextView bioSocio = findViewById(R.id.tvBio);
        RatingBar puntuacion = findViewById(R.id.rbPuntuacion);

        //1-Recogemos la informacion procedente del main activity
        Bundle extras = getIntent().getExtras();



        //2a-Enlazamos cada campo con el dato correpondiente
            //nombreSocio.setText(extras.getString("nombreSocio"));
            //apellidoSocio.setText(extras.getString("apellidoSocio"));
            //bioSocio.setText(extras.getString("bioSocio"));
            //puntuacion.setRating(extras.getFloat("puntuacion"));


        //2b-Obtener el objeto que le hemos pasado
        Socio nuevoSocio = extras.getParcelable("nuevoSocio");

        //2b.1
        nombreSocio.setText(nuevoSocio.getNombre());
        apellidoSocio.setText(nuevoSocio.getApellido());
        bioSocio.setText(nuevoSocio.getBiografia());
        puntuacion.setRating(nuevoSocio.getPuntuacion());






    }
}