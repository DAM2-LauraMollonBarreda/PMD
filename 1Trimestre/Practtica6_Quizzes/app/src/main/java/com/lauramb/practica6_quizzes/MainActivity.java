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
    private Pregunta[] preguntas = new Pregunta[3];
    private int preguntaAnterior;
    RadioButton rb1, rb2,rb3;
    TextView pregunta, numeroPregunta;
    Button botonSend;

    int respuestasCorrectas = 0;
    int respuestasIncorrectas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preguntas[0] = new Pregunta(1, "Rey de España en 2021", "Felipe VI", "Felipe V", "Juan Carlos I", 1);
        preguntas[1] = new Pregunta(2, "Heredera de la corona", "Letizia Ortiz", "Sofia de Borbon", "Leonor de Borbon", 3);
        preguntas[2] = new Pregunta(3, "Residencia habitual de los reyes", "Palacio de Oriente", "Palacio la Zarzuela", "Palacio de los maestres de Santiago.", 2);

        pregunta= (TextView) findViewById(R.id.txtvPregunta);
        numeroPregunta= (TextView) findViewById(R.id.txtvNumero);

        rb1 = (RadioButton) findViewById(R.id.radiobuRes1);
        rb2 = (RadioButton) findViewById(R.id.radiobuRes2);
        rb3 = (RadioButton) findViewById(R.id.radiobuRes3);

        botonSend=(Button)findViewById(R.id.btnSend);

        preguntaAnterior=0;

        botonSend.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int respuestaSeleccionada = -1;
                boolean seleccionada = true;

                if (seleccionada = true) {
                    if (rb1.isChecked()) {
                        respuestaSeleccionada = 1;
                    } else if (rb2.isChecked()) {
                        respuestaSeleccionada = 2;
                    } else if (rb3.isChecked()) {
                        respuestaSeleccionada = 3;
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "No hay respuestas seleccionadas", Toast.LENGTH_SHORT);
                        toast.show();
                        seleccionada = false;
                        return;
                    }
                }
            }
        });
    }
}
