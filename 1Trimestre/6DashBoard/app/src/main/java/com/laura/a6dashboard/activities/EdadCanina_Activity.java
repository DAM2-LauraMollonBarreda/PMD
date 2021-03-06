package com.laura.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.laura.a6dashboard.R;

public class EdadCanina_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad_canina);
        setTitle("Mi edad canina");
        //1-Agregamos los ids a los elementos
        EditText edadEdit = findViewById(R.id.edad_et);
        TextView resultadoText = findViewById(R.id.resultado_tv);
        Button boton = findViewById(R.id.button_btn);

//        Log.v("MainActivity",  "La actividad principal se ha creado");
        Log.d("MainActivity",  "La actividad principal se ha creado");
//        Log.i("MainActivity",  "La actividad principal se ha creado");
//        Log.w("MainActivity",  "La actividad principal se ha creado");
//        Log.e("MainActivity",  "La actividad principal se ha creado");





        //2- Damos actividad al boton al ser pulsado
        boton.setOnClickListener(view -> {
            //3- Recojemos el texto del edit text
            String edad = edadEdit.getText().toString();

            if(!edad.isEmpty()){
                //4- Convertir ese string a entero
                int edadInt = Integer.parseInt(edad);
                //5-Calcular la edad canina
                int resultado = edadInt *7;
                //6-Creamos el texto que vamos a mostrar
                String resultadoString= getString(R.string.txt_resultado,resultado);
                //7-Asignamos el texto al elemento text view
                resultadoText.setText(resultadoString);
            }else{
                Log.d("MainActivity","Has introducido en campo vacio");
                Toast.makeText(this,getString(R.string.msg_toast) ,Toast.LENGTH_SHORT).show();

            }

        });
    }
}