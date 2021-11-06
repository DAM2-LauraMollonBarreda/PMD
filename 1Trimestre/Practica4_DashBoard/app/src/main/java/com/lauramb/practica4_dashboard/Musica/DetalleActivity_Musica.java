package com.lauramb.practica4_dashboard.Musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.lauramb.practica4_dashboard.Musica.model.Disco;
import com.lauramb.practica4_dashboard.R;

public class DetalleActivity_Musica extends AppCompatActivity {
    private TextView tvTitulo, tvTitulo2, tvDescripcion;
    private ImageView imgFoto;
    private Disco item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_musica);

        item = (Disco) getIntent().getSerializableExtra("item");
        if (item!=null){
            tvTitulo = findViewById(R.id.txtTitulo);
            tvTitulo2 = findViewById(R.id.txtTitulo2);
            tvDescripcion = findViewById(R.id.txtInfo);
            imgFoto = findViewById(R.id.imageView);

            tvTitulo.setText(item.getTitulo());
            tvTitulo2.setText(item.getTitulo());
            tvDescripcion.setText(item.getAutor());
            imgFoto.setImageResource(item.getImagen());
        }
    }
}