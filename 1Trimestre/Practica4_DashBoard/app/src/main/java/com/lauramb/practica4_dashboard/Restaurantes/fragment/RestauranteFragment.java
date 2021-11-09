package com.lauramb.practica4_dashboard.Restaurantes.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lauramb.practica4_dashboard.R;
import com.lauramb.practica4_dashboard.Restaurantes.fragment.placeholder.PlaceholderContent;
import com.lauramb.practica4_dashboard.Restaurantes.model.Restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class RestauranteFragment extends Fragment {
    //1-Declaramos las variables fuera para poder acceder a la variable fuera del onCreateView
    RecyclerView recyclerView;
    MyRestauranteRecyclerViewAdapter adapterRestaurantes;

    //2-Creamos una lista de restaurates
    List<Restaurante> restauranteList;


    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public RestauranteFragment() {
    }

    public static RestauranteFragment newInstance(int columnCount) {
        RestauranteFragment fragment = new RestauranteFragment();
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

    //4
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //5-Creamos una vista y la inflamos, asociandola a un xml
        View view = inflater.inflate(R.layout.fragment_restaurante_list, container, false);

        //6-Comprovamos que el xml sea una instacia del recycleview
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            //7-Declaramos la lista que hemos creado antes y la llenamos
            restauranteList=new ArrayList<>();
            restauranteList.add(new Restaurante("La trufa negra","https://estaticos-cdn.elperiodico.com/clip/f6f6d7d9-5a72-4730-bd4b-9534cdeb45d5_alta-libre-aspect-ratio_default_0.jpg",4.3f,"Mora de Rubielos,Teruel,España"));
            //3-Asociamos el adatador al recicle view
            adapterRestaurantes = new MyRestauranteRecyclerViewAdapter(getActivity(), restauranteList);
            recyclerView.setAdapter(adapterRestaurantes);

        }
        return view;
    }
}