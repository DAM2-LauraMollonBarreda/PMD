package com.laura.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbFulbol = findViewById(R.id.cBFutbol);
        CheckBox cbBaloncesto = findViewById(R.id.cbBaloncesto);
        CheckBox cbPadel = findViewById(R.id.cbPadel);
    }

    public void clickOnHobby(View view) {
        switch (view.getId()){
            case R.id.cBFutbol:
                Toast.makeText(this,"Fulbol a sido pulsado", Toast.LENGTH_SHORT);
                break;
        }
    }
}