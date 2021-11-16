package com.laura.a15cartapizzeria;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class PizzaFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    RecyclerView recyclerView;
    MyPizzaRecyclerViewAdapter adaptadorPizza;
    List<Pizza> pizzasList;
    Retrofit retrofit;

    public  static final String BASE_URL = "https://private-3cc5a4-codingpizza.apiary-mock.com";

    public PizzaFragment() {
    }


    @SuppressWarnings("unused")
    public static PizzaFragment newInstance(int columnCount) {
        PizzaFragment fragment = new PizzaFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pizza_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
           recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            //1- Uso RETROFIT para obtener la lista de pizza       https://square.github.io/retrofit/
            retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

            //2-Llama a obtenerListaPizaa para obtener la lista de pizza
            obtenerListaPizzas(retrofit,context);




        }
        return view;
    }

    private void obtenerListaPizzas(Retrofit retrofit, Context context) {
        PizzaService pizzaService = retrofit.create(PizzaService.class);
        Call<List<Pizza>> pizzaList = pizzaService.obtenerPizzas();

        pizzaList.enqueue(new Callback<List<Pizza>>() {
            @Override
            public void onResponse(Call<List<Pizza>> call, Response<List<Pizza>> response) {
                if (response.isSuccessful()){
                    adaptadorPizza= new MyPizzaRecyclerViewAdapter(response.body(), context);
                    recyclerView.setAdapter(adaptadorPizza);
                }else{
                    Log.e("PIZZA","onResponse: llamada fallida en onResponse");
                }
            }

            @Override
            public void onFailure(Call<List<Pizza>> call, Throwable t) {
                Log.e("PIZZA","onFailure: llamada fallida en onFailure");
            }
        });
    }
}