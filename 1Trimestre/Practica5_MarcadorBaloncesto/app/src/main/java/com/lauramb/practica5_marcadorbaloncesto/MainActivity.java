package com.lauramb.practica5_marcadorbaloncesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declaramos los botones
    Button btnRestarLocal, btnRestarVisitante, btnReloj, btnSiguiente,btnUnoVisitante, btnDosVisitante, btnUnoLocal, btnDosLocal;
    TextView tvPuntosLocal, tvPuntosVisitante;

    //Declaramos las variables que nos hacen falta en el programa
    String localValor, visitanteValor;
    int puntosLocal, puntosVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Marcador");
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

        //Cojemos el valor que tenemos en el textView
        localValor = (String) tvPuntosLocal.getText();
        visitanteValor=(String) tvPuntosVisitante.getText();
        //Y lo pasamos a entero para poder compararlo con numeros
        puntosLocal= Integer.parseInt(localValor);
        puntosVisitante = Integer.parseInt(visitanteValor);

        //Abrimos la otra pestaña para ver el resultado final
        btnSiguiente.setOnClickListener(view -> {
            Intent irScore = new Intent(this,ScoreActivity.class);
            String mostrarPuntosLocal = puntosLocal+"";
            irScore.putExtra("Resultado local",mostrarPuntosLocal);
            String mostrarPuntosVisitante = puntosVisitante+"";
            irScore.putExtra("Resultado visitante",mostrarPuntosVisitante);
            startActivity(irScore);
        });

        //Botones para restar los puntos
        btnRestarLocal.setOnClickListener(view -> {
           //Si el marcador ya esta ha cero no poder restar mas
           if(puntosLocal>0){
               //Restamos un punto al textView
                puntosLocal=puntosLocal-1;
                //Y lo volvemos a pasar a string para que deje mostrarlo en el TextView
                String mostrarPuntos = puntosLocal+"";
                //Lo mostramos en TextView
                tvPuntosLocal.setText(mostrarPuntos);
           } else{
               Toast.makeText(this, getString(R.string.errorRestar), Toast.LENGTH_SHORT).show();
           }
        });
        btnRestarVisitante.setOnClickListener(view -> {
            //Si el marcador ya esta ha cero no poder restar mas
            if(puntosVisitante>0){
                //Restaos un punto al textView
                puntosVisitante=puntosVisitante-1;
                //Y lo volvemos a pasar a string para que deje mostrarlo en el TextView
                String mostrarPuntos = puntosVisitante+"";
                //Lo mostramos en TextView
                tvPuntosVisitante.setText(mostrarPuntos);
            } else{
                Toast.makeText(this, getString(R.string.errorRestar), Toast.LENGTH_SHORT).show();
            }
        });

        //Botones para sumar un punto
        btnUnoLocal.setOnClickListener(view -> {
            //Sumamos un punto al textView
            puntosLocal=puntosLocal+1;
            //Y lo volvemos a pasar a string para que deje mostrarlo en el TextView
            String mostrarPuntos = puntosLocal+"";
            //Lo mostramos en TextView
            tvPuntosLocal.setText(mostrarPuntos);
        });
        btnUnoVisitante.setOnClickListener(view -> {
            //Sumamos un punto al textView
            puntosVisitante=puntosVisitante+1;
            //Y lo volvemos a pasar a string para que deje mostrarlo en el TextView
            String mostrarPuntos = puntosVisitante+"";
            //Lo mostramos en TextView
            tvPuntosVisitante.setText(mostrarPuntos);
        });

        //Botones para sumar dos puntos
        btnDosLocal.setOnClickListener(view -> {
            //Sumamos dos puntos al textView
            puntosLocal=puntosLocal+2;
            //Y lo volvemos a pasar a string para que deje mostrarlo en el TextView
            String mostrarPuntos = puntosLocal+"";
            //Lo mostramos en TextView
            tvPuntosLocal.setText(mostrarPuntos);
        });
        btnDosVisitante.setOnClickListener(view -> {
            //Sumamos dos puntos al textView
            puntosVisitante=puntosVisitante+2;
            //Y lo volvemos a pasar a string para que deje mostrarlo en el TextView
            String mostrarPuntos = puntosVisitante+"";
            //Lo mostramos en TextView
            tvPuntosVisitante.setText(mostrarPuntos);
        });

        //Boton para dejar los marcadores a cero
        btnReloj.setOnClickListener(view -> {
            if(puntosLocal==0 & puntosVisitante==0) {
                Toast.makeText(this, getString(R.string.marcadoresCero), Toast.LENGTH_SHORT).show();
            }else{
                //Para el text view de los puntos locales
                //Dejamos los puntos a 0
                puntosLocal = 0;
                //Y lo volvemos a pasar a string para que deje mostrarlo en el TextView
                String mostrarPuntosLocal = puntosLocal + "";
                //Lo mostramos en TextView
                tvPuntosLocal.setText(mostrarPuntosLocal);

                //Para el text view de los puntos visitatantes
                //Dejamos los puntos a 0
                puntosVisitante = 0;
                //Y lo volvemos a pasar a string para que deje mostrarlo en el TextView
                String mostrarPuntosVisitante = puntosVisitante + "";
                //Lo mostramos en TextView
                tvPuntosVisitante.setText(mostrarPuntosVisitante);
            }
        });

    }

}