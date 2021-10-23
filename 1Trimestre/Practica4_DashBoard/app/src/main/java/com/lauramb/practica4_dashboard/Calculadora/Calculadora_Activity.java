package com.lauramb.practica4_dashboard.Calculadora;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.lauramb.practica4_dashboard.R;

public class Calculadora_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Calculadora");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        //1-Agregamos los ids a los elementos
        EditText n1 = findViewById(R.id.et_numero1);
        EditText n2 = findViewById(R.id.et_numero2);
        TextView resultadoText = findViewById(R.id.tv_resultado);
        Button botonSuma = findViewById(R.id.btn_sumar);
        Button botonResta = findViewById(R.id.btn_restar);
        Button botonMulti= findViewById(R.id.btn_multiplicar);
        Button botonDivision = findViewById(R.id.btn_dividir);

//        Log.v("MainActivity",  "La actividad principal se ha creado");
        Log.d("MainActivity",  "La actividad principal se ha creado");
//        Log.i("MainActivity",  "La actividad principal se ha creado");
//        Log.w("MainActivity",  "La actividad principal se ha creado");
//        Log.e("MainActivity",  "La actividad principal se ha creado");





        //2- Damos actividad al boton sumar al ser pulsado
        botonSuma.setOnClickListener(view -> {
            //3- Recojemos el texto del edit text
            String numero1 = n1.getText().toString();
            String numero2 = n2.getText().toString();

            if(!numero1.isEmpty() && !numero2.isEmpty()){
                //4- Convertir esos string a entero
                int n1int = Integer.parseInt(numero1);
                int n2int = Integer.parseInt(numero2);
                //5-Calcular la suma
                int resultado = n1int + n2int;
                //6-Creamos el texto que vamos a mostrar
                String resultadoString= numero1+ "+" + numero2 +"="+ resultado;
                //7-Asignamos el texto al elemento text view
                resultadoText.setText(resultadoString);
            }else{
                Log.d("MainActivity","Has introducido en campo vacio");
                Toast.makeText(this,"No has introducido ningun numero",Toast.LENGTH_SHORT).show();

            }

        });

        //2- Damos actividad al boton restar al ser pulsado
        botonResta.setOnClickListener(view -> {
            //3- Recojemos el texto del edit text
            String numero1 = n1.getText().toString();
            String numero2 = n2.getText().toString();

            if(!numero1.isEmpty() && !numero2.isEmpty()){
                //4- Convertir esos string a entero
                int n1int = Integer.parseInt(numero1);
                int n2int = Integer.parseInt(numero2);
                //5-Calcular la suma
                int resultado = n1int - n2int;
                //6-Creamos el texto que vamos a mostrar
                String resultadoString= numero1+ "-" + numero2 +"="+ resultado;
                //7-Asignamos el texto al elemento text view
                resultadoText.setText(resultadoString);
            }else{
                Log.d("MainActivity","Has introducido en campo vacio");
                Toast.makeText(this,"No has introducido ningun numero",Toast.LENGTH_SHORT).show();

            }

        });

        //2- Damos actividad al boton multiplicar al ser pulsado
        botonMulti.setOnClickListener(view -> {
            //3- Recojemos el texto del edit text
            String numero1 = n1.getText().toString();
            String numero2 = n2.getText().toString();

            if(!numero1.isEmpty() && !numero2.isEmpty()){
                //4- Convertir esos string a entero
                int n1int = Integer.parseInt(numero1);
                int n2int = Integer.parseInt(numero2);
                //5-Calcular la suma
                int resultado = n1int * n2int;
                //6-Creamos el texto que vamos a mostrar
                String resultadoString= numero1+ "*" + numero2 +"="+ resultado;
                //7-Asignamos el texto al elemento text view
                resultadoText.setText(resultadoString);
            }else{
                Log.d("MainActivity","Has introducido en campo vacio");
                Toast.makeText(this,"No has introducido ningun numero",Toast.LENGTH_SHORT).show();

            }

        });

        //2- Damos actividad al boton dividir al ser pulsado
        botonDivision.setOnClickListener(view -> {
            //3- Recojemos el texto del edit text
            String numero1 = n1.getText().toString();
            String numero2 = n2.getText().toString();

            if(!numero1.isEmpty() && !numero2.isEmpty()){
                //4- Convertir esos string a entero
                int n1int = Integer.parseInt(numero1);
                int n2int = Integer.parseInt(numero2);
                //5-Calcular la suma
                int resultado = n1int / n2int;
                //6-Creamos el texto que vamos a mostrar
                String resultadoString= numero1+ "/" + numero2 +"="+ resultado;
                //7-Asignamos el texto al elemento text view
                resultadoText.setText(resultadoString);
            }else{
                Log.d("MainActivity","Has introducido en campo vacio");
                Toast.makeText(this,"No has introducido ningun numero",Toast.LENGTH_SHORT).show();

            }

        });
    }
}