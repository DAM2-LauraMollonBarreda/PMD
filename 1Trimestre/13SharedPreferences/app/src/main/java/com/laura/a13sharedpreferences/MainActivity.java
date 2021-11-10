package com.laura.a13sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnEntrar);
        editTextEmail= findViewById(R.id.editTextTextEmailAddress);
        editTextPassword= findViewById(R.id.editTextTextPassword);

        //1-Lo primero al iniciar la aplicaion debe mostrar lo que tiene guardado en el archivo sharedPreferences
        //Obtengo los valores que se han creado previamente
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        //Aqui tenemos que escribir la referencia del valor que buscamos
        //El par de comillas vacio es el valor inicial en caso de que no haya ningun valor
        editTextEmail.setText(preferencias.getString("email",""));
        editTextPassword.setText(preferencias.getString("pass",""));

        btnLogin.setOnClickListener(view -> {
            Guardar();
            Toast.makeText(this,"Se ha guardado correctamente", Toast.LENGTH_SHORT).show();
        });

    }

    public void Guardar(){
        //En este caso de crear el objeto nuevamente
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        //Editor es la clase que me sirve para modificar este archivo
        //Vamos a modificar el archivo shared preferences
        SharedPreferences.Editor Obj_editor = preferencias.edit();
        Obj_editor.putString("email", editTextEmail.getText().toString());
        Obj_editor.putString("pass", editTextPassword.getText().toString());
        //Commit confirma que lo que acabamos de recuperar arriba lo queremos que guardar, sin commit no guarda nada en SharedPreferends
        Obj_editor.commit();
    }
}