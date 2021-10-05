package com.laura.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGuardar = findViewById(R.id.boton_guardar);
        EditText etNombre= findViewById(R.id.nombre_socio);
        EditText etApellidos = findViewById(R.id.apellido_socio);
        EditText etBio = findViewById(R.id.editTextBio);
        RatingBar rtBar= findViewById(R.id.ratingBar);


        btnGuardar.setOnClickListener(view -> {
            String nombreSocio = etNombre.getText().toString();
            String apellidoSocio=etApellidos.getText().toString();
            String bioSocio = etBio.getText().toString();
            Float puntuacion=rtBar.getRating();

            //1-Nos creamos el intent irDetalle
            Intent irDetalle = new Intent(this, DetailActivity.class);

            //2a-Añadimos toda la informacion que queremos pasar al detalle activity
                // irDetalle.putExtra("nombreSocio",nombreSocio);
                //irDetalle.putExtra("apellidoSocio",apellidoSocio);
                //irDetalle.putExtra("bioSocio",bioSocio);
                //irDetalle.putExtra("puntuacion",puntuacion);

            //2b.1-Creamos un objeto socio con los datos que corresponden
            Socio nuevoSocio = new Socio(
                    nombreSocio,
                    apellidoSocio,
                    bioSocio,
                    puntuacion
            );

            //2b.2 Enviamos el objeto al intent
            irDetalle.putExtra("nuevoSocio",nuevoSocio);

            //3-Nos vamos al detail activity
            startActivity(irDetalle);

        });

    }
}