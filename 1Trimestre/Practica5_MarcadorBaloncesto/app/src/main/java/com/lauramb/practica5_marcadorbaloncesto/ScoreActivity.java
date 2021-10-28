package com.lauramb.practica5_marcadorbaloncesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    TextView tvResLocal, tvResVisitante;
    TextView tvTextoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Resultado final");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

       tvResLocal= (TextView)findViewById(R.id.tvResLocal);
       tvResVisitante= (TextView)findViewById(R.id.tvResVisitante);
       tvTextoResultado= (TextView)findViewById(R.id.tvTextoResultado);


        //Recojemos los datos que pasamos en el intent
        Bundle extras = getIntent().getExtras();
        //Los guardamos en una variable ya que los vamos a necesitar en el programa
        String resLocal =extras.getString("Resultado local");
        String resVisitante=extras.getString("Resultado visitante");
        //Pasamos los puntos a los textView
        tvResLocal.setText(resLocal);
        tvResVisitante.setText(resVisitante);

        //Pasomos las string que hemos recogido a enteros
        int resultadoLocal= Integer.parseInt(resLocal);
        int resultadoVisistnate = Integer.parseInt(resVisitante);

        if(resultadoLocal == resultadoVisistnate){
            tvTextoResultado.setText(R.string.parEmpatado);
        }else if(resultadoLocal<resultadoVisistnate){
            tvTextoResultado.setText(R.string.parGaV);
        }else if (resultadoVisistnate<resultadoLocal){
            tvTextoResultado.setText(R.string.parGaL);
        }
    }
}