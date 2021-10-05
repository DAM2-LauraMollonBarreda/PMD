package com.laura.practica2_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEntrar = findViewById(R.id.btnEntrar);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etContraseña = findViewById(R.id.etContraseña);

        btnEntrar.setOnClickListener(view -> {

            String email = etEmail.getText().toString();
            String contra = etContraseña.getText().toString();
            if (!email.isEmpty() && !contra.isEmpty()) {
                Intent irSegunda = new Intent(this, SegundaActivity.class);

                irSegunda.putExtra("email", email);

                startActivity(irSegunda);
            }
            else{
                Toast.makeText(this,"Falta algún campo por rellenar",Toast.LENGTH_SHORT).show();
            }

        });

    }
}