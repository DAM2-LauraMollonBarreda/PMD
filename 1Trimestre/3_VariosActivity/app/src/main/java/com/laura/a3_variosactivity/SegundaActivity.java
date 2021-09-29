package com.laura.a3_variosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnIrAc1;
    Button btnIrAc3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        btnIrAc1 = findViewById(R.id.btn2);
        btnIrAc3=findViewById(R.id.btn3);

        btnIrAc1.setOnClickListener(this);
        btnIrAc3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //Para cambiar de activity lo primero que haremos sera crearnos el Intent
        //1-Le diremos en el primer campo desde donde le llamamos y en el segundo a donde queremos ir
        Intent iraActivity1 = new  Intent(SegundaActivity.this,MainActivity.class);
        Intent iraActivity3 = new Intent(SegundaActivity.this, TerceraActivity.class);
        //2- Lanzamos el activity con el metodo strart Activity
        startActivity(iraActivity1);
        startActivity(iraActivity3);
    }
}

//probando git
//cambios 2