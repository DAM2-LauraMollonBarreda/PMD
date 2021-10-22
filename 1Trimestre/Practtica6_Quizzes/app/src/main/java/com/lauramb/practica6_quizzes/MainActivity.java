package com.lauramb.practica6_quizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaramos los botones y llamamos a la clase pregunta
    private Pregunta[] preguntas = new Pregunta[3];
    RadioButton rb1, rb2,rb3;
    TextView pregunta, numeroPregunta;
    Button botonSend;

    private int preguntaActual;
    int buenas = 0;
    int malas = 0;

    @Override
    //Cuando se abre la aplicacion
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se cargan tres preguntas
        preguntas[0] = new Pregunta("1/3", "Rey de España en 2021", "Felipe VI", "Felipe V", "Juan Carlos I", 1);
        preguntas[1] = new Pregunta("2/3", "Heredera de la corona", "Letizia Ortiz", "Sofia de Borbon", "Leonor de Borbon", 3);
        preguntas[2] = new Pregunta("3/3", "Residencia habitual de los reyes", "Palacio de Oriente", "Palacio la Zarzuela", "Palacio de los maestres de Santiago.", 2);

        //Se asocian los botones al diseño
        pregunta= (TextView) findViewById(R.id.txtvPregunta);
        numeroPregunta= (TextView) findViewById(R.id.txtvNumero);

        rb1 = (RadioButton) findViewById(R.id.radiobuRes1);
        rb2 = (RadioButton) findViewById(R.id.radiobuRes2);
        rb3 = (RadioButton) findViewById(R.id.radiobuRes3);

        botonSend=(Button)findViewById(R.id.btnSend);



        //Cuando se pulsa el boton enviar
        botonSend.setOnClickListener(view -> {
            validarPasarSiguiente();

        });
        mostrarPreguntaActual();
    }

    private void validarPasarSiguiente() {
        //Obtenemos lo que el usuario a seleccionado
        int resulSelec=0;
        if (rb1.isChecked()){
            resulSelec=1;
        }else if (rb2.isChecked()){
            resulSelec=2;
        }else if (rb3.isChecked()){
            resulSelec=3;
        }else{
            Toast.makeText(this, "Selecciona una opcion", Toast.LENGTH_SHORT).show();
        }

        //Guadarmos si la respuesta dada es correcta
        if (preguntas[preguntaActual].getRespuestaCorrecta()== resulSelec){
            buenas++;
            preguntaActual++;
            pantalla2();

            mostrarPreguntaActual();

            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);
        }else{
            malas++;
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
        }




    }
    //Metodo para pasar a la pantalla 2
    private void pantalla2() {
        if (preguntaActual<3){
            Intent irSegunda = new Intent(this, PantallaSecundaria.class);
            irSegunda.putExtra("Resultado correcto", "Correcto!");
            irSegunda.putExtra("Boton", "Siguiente");
            startActivity(irSegunda);
        }else{
            Intent irSegunda = new Intent(this, PantallaSecundaria.class);
            irSegunda.putExtra("Resultado correcto", "Has acabado el juego!");
            irSegunda.putExtra("Boton","Comenzar el juego");
            startActivity(irSegunda);
        }
    }


    public void mostrarPreguntaActual(){
        Pregunta numPregunta =preguntas[preguntaActual];
        numeroPregunta.setText(numPregunta.getNumero());
        Pregunta infoDePregunta = preguntas[preguntaActual];
        pregunta.setText(infoDePregunta.getPregunta());
        rb1.setText(infoDePregunta.getRespuesta()[0]);
        rb2.setText(infoDePregunta.getRespuesta()[1]);
        rb3.setText(infoDePregunta.getRespuesta()[2]);
    }

}
