package com.lauramb.practica5_marcadorbaloncesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declaramos los botones
    Button btnRestarLocal, btnRestarVisitante, btnReloj, btnSiguiente,btnUnoVisitante, btnDosVisitante, btnUnoLocal, btnDosLocal;
    TextView tvPuntosLocal, tvPuntosVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Marcador baloncesto");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociar los botones al diseño
        btnRestarLocal=(Button) findViewById(R.id.btnRestarLocal);
        btnRestarVisitante=(Button) findViewById(R.id.btnRestarVisitante);
        btnReloj=(Button) findViewById(R.id.btnReloj);
        btnSiguiente=(Button) findViewById(R.id.btnSiguiente);
        btnUnoVisitante=(Button) findViewById(R.id.btnUnoVisitante);
        btnDosVisitante=(Button) findViewById(R.id.btnDosVisitante);
        btnUnoLocal=(Button) findViewById(R.id.btnUnoLocal);
        btnDosLocal=(Button) findViewById(R.id.btnDosLocal);

        tvPuntosLocal= (TextView) findViewById(R.id.tvPuntosLocal);
        tvPuntosVisitante=(TextView)findViewById(R.id.tvPuntosVisitante);

        btnSiguiente.setOnClickListener(view -> {
            Intent irScore = new Intent(this,ScoreActivity.class);
            //irScore.putExtra("Resultado local",tvPuntosLocal);
            startActivity(irScore);
        });

    }
}