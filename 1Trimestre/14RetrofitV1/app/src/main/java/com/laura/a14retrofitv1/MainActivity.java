package com.laura.a14retrofitv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView myJsonTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myJsonTextView=findViewById(R.id.jsonText);

        //1-Creamos una instancia de retrofit
        Retrofit retrofit = new Retrofit.Builder()
                //2- Pasamos la url base
                .baseUrl("https://jsonplaceholder.typicode.com/")
                //3-Necesitamso añadir un converter a esta response
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //4-LLamamos a la intefaz
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        //5-Creamos un call del tipo de datos que vamos a recuperar
        Call<List<Post>> call = jsonPlaceHolderApi.obtenerPostDeLaApi();

        //El execute lo hara en el Main Thread y no es recompendable hacerlo
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                //7-Manejamos la respuesta exitosa
                if (!response.isSuccessful()){
                    //No es un probleam de tipo Failture, si no cualquier codigo http que no sea el 200
                    myJsonTextView.setText("codigo: " + response.code());
                    return;
                }
                //9-Creamos una lista que tenga los post
                List<Post> listaPosts = response.body();
                //10-Creamos un for para recuperar los elementos de la lista
                for(Post post: listaPosts){
                    String content="";
                    content +="userId    "+ post.getUserId() + "\n";
                    content +="Id     "+ post.getId() + "\n";
                    content +="title    "+ post.getTitle() + "\n";
                    content +="body     "+ post.getBody() + "\n\n\n";
                    myJsonTextView.append(content);
                }

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                //8-Aqui se manejan los errores si no se ha traido bien la respuesta
                myJsonTextView.setText(t.getMessage());
            }
        });
    }
}