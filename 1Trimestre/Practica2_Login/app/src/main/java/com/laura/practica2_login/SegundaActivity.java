package com.laura.practica2_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegundaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle extras = getIntent().getExtras();

        setTitle(extras.getString("email"));

        TextView correo = findViewById(R.id.tvEmail);



        correo.setText("Bienvenido: "+extras.getString("email"));
    }
}