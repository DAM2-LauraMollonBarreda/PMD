package com.lauramb.practica4_dashboard.Hoteles.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lauramb.practica4_dashboard.Hoteles.model.Hotel;
import com.lauramb.practica4_dashboard.R;
import com.lauramb.practica4_dashboard.Hoteles.model.Hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class HotelFragment extends Fragment {
    //1-Declaramos las variables fuera para poder acceder a la variable fuera del onCreateView
    RecyclerView recyclerView;
    MyHotelRecyclerViewAdapter adapterHotel;

    //2-Creamos una lista de hoteles
    List<Hotel> hotelList;


    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public HotelFragment() {
    }

    public static HotelFragment newInstance(int columnCount) {
        HotelFragment fragment = new HotelFragment();
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
        View view = inflater.inflate(R.layout.fragment_hotel_list, container, false);

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
            hotelList=new ArrayList<>();
            hotelList.add(new Hotel("La trufa negra","https://y.cdrst.com/foto/hotel-sf/9349/granderesp/hotel-la-trufa-negra-servicios-ad6e4ca.jpg",
                    4.3f,"Mora de Rubielos,Teruel,España","https://lh3.googleusercontent.com/hSzMim88cQoSTsCiJ9D27pUeeKlvhYn1tkFvPsWA7F6KuH250iRMAelCeqTR7SBMNPOScy3c4dgHd9EmiGzPwuarSo7CDZ-Q6ARqjYX2zxmLCCjRzi7GUP74gnwA7kJ3yfjALC7KIdHfFlSftgNON9Hkk1dKWHLyaN5SQPdARA6TuATDL6rFvLICfsMD4tdjX9J6wgGhDnW6TgptNZLpNPES_ukHPX1n7DwVAe4kzAJjBf4yMsIHSx5cWBBsXcemeveNp8noap30DNxSFKWpRvl3pQr_Z-INPMcxdByOECQKsCZyQa7B5J0ZnScAbhqr_YEtk6XNI73SZRtInt7stg-F36nZ_kRBB82-988evBTeKg7ZrIXsyzzsw5aqI2KAYYcoxRazxtRV0HKdG4ATe3FTh9DILBM9uETRYsZCNZck4BFwixSQzTeP-R2sMSwaJfl5uXw2RiPzyVoAIrmvix090Jk0qQJU38vWG5K6eoDb3z5su_0jPWxEXnzJlr5hmmqUhFrW-3Xm9q6wcXGnbNzty15EzEnm91fA-dT3zo350sLQ7fDvSdXG-cMWrJW4SkAHehO1vZTtSkAxeMFDYYgtdK-FbOZxyn2gk_82n_Ae-9_telnFsMFtSpXm1iR7CHcqsiud5A4Cf9V-M69UfQXYzFTITDCMYnN_MtQv5c0WkJ4rXDZVUTgVO9u3npPMNoCueZuaCtxZZQWpD5R9A3JM=w323-h98-no?authuser=0"));

            hotelList.add(new Hotel("Masia la Torre","https://cf.bstatic.com/xdata/images/hotel/max1024x768/218907691.jpg?k=000bbcf27b5a07a6a042c67bf3e06662df89ad4fadc6bbb00475a2af119d57f6&o=&hp=1",
                    4.7f,"Mora de Rubielos,Teruel,España","https://lh3.googleusercontent.com/hSzMim88cQoSTsCiJ9D27pUeeKlvhYn1tkFvPsWA7F6KuH250iRMAelCeqTR7SBMNPOScy3c4dgHd9EmiGzPwuarSo7CDZ-Q6ARqjYX2zxmLCCjRzi7GUP74gnwA7kJ3yfjALC7KIdHfFlSftgNON9Hkk1dKWHLyaN5SQPdARA6TuATDL6rFvLICfsMD4tdjX9J6wgGhDnW6TgptNZLpNPES_ukHPX1n7DwVAe4kzAJjBf4yMsIHSx5cWBBsXcemeveNp8noap30DNxSFKWpRvl3pQr_Z-INPMcxdByOECQKsCZyQa7B5J0ZnScAbhqr_YEtk6XNI73SZRtInt7stg-F36nZ_kRBB82-988evBTeKg7ZrIXsyzzsw5aqI2KAYYcoxRazxtRV0HKdG4ATe3FTh9DILBM9uETRYsZCNZck4BFwixSQzTeP-R2sMSwaJfl5uXw2RiPzyVoAIrmvix090Jk0qQJU38vWG5K6eoDb3z5su_0jPWxEXnzJlr5hmmqUhFrW-3Xm9q6wcXGnbNzty15EzEnm91fA-dT3zo350sLQ7fDvSdXG-cMWrJW4SkAHehO1vZTtSkAxeMFDYYgtdK-FbOZxyn2gk_82n_Ae-9_telnFsMFtSpXm1iR7CHcqsiud5A4Cf9V-M69UfQXYzFTITDCMYnN_MtQv5c0WkJ4rXDZVUTgVO9u3npPMNoCueZuaCtxZZQWpD5R9A3JM=w323-h98-no?authuser=0"));

            hotelList.add(new Hotel("Mas de cebrian","https://masdecebrian.com/img/habitaciones/4435.jpg",
                    4.0f,"Puertomingalvo,Teruel,España","https://lh3.googleusercontent.com/hSzMim88cQoSTsCiJ9D27pUeeKlvhYn1tkFvPsWA7F6KuH250iRMAelCeqTR7SBMNPOScy3c4dgHd9EmiGzPwuarSo7CDZ-Q6ARqjYX2zxmLCCjRzi7GUP74gnwA7kJ3yfjALC7KIdHfFlSftgNON9Hkk1dKWHLyaN5SQPdARA6TuATDL6rFvLICfsMD4tdjX9J6wgGhDnW6TgptNZLpNPES_ukHPX1n7DwVAe4kzAJjBf4yMsIHSx5cWBBsXcemeveNp8noap30DNxSFKWpRvl3pQr_Z-INPMcxdByOECQKsCZyQa7B5J0ZnScAbhqr_YEtk6XNI73SZRtInt7stg-F36nZ_kRBB82-988evBTeKg7ZrIXsyzzsw5aqI2KAYYcoxRazxtRV0HKdG4ATe3FTh9DILBM9uETRYsZCNZck4BFwixSQzTeP-R2sMSwaJfl5uXw2RiPzyVoAIrmvix090Jk0qQJU38vWG5K6eoDb3z5su_0jPWxEXnzJlr5hmmqUhFrW-3Xm9q6wcXGnbNzty15EzEnm91fA-dT3zo350sLQ7fDvSdXG-cMWrJW4SkAHehO1vZTtSkAxeMFDYYgtdK-FbOZxyn2gk_82n_Ae-9_telnFsMFtSpXm1iR7CHcqsiud5A4Cf9V-M69UfQXYzFTITDCMYnN_MtQv5c0WkJ4rXDZVUTgVO9u3npPMNoCueZuaCtxZZQWpD5R9A3JM=w323-h98-no?authuser=0"));


            hotelList.add(new Hotel("La posada","https://laposadademosqueruela.com/wp-content/uploads/2017/08/hotel-valdelinares-6.jpg",
                    4.6f,"Mosqueruela,Teruel,España","https://lh3.googleusercontent.com/hSzMim88cQoSTsCiJ9D27pUeeKlvhYn1tkFvPsWA7F6KuH250iRMAelCeqTR7SBMNPOScy3c4dgHd9EmiGzPwuarSo7CDZ-Q6ARqjYX2zxmLCCjRzi7GUP74gnwA7kJ3yfjALC7KIdHfFlSftgNON9Hkk1dKWHLyaN5SQPdARA6TuATDL6rFvLICfsMD4tdjX9J6wgGhDnW6TgptNZLpNPES_ukHPX1n7DwVAe4kzAJjBf4yMsIHSx5cWBBsXcemeveNp8noap30DNxSFKWpRvl3pQr_Z-INPMcxdByOECQKsCZyQa7B5J0ZnScAbhqr_YEtk6XNI73SZRtInt7stg-F36nZ_kRBB82-988evBTeKg7ZrIXsyzzsw5aqI2KAYYcoxRazxtRV0HKdG4ATe3FTh9DILBM9uETRYsZCNZck4BFwixSQzTeP-R2sMSwaJfl5uXw2RiPzyVoAIrmvix090Jk0qQJU38vWG5K6eoDb3z5su_0jPWxEXnzJlr5hmmqUhFrW-3Xm9q6wcXGnbNzty15EzEnm91fA-dT3zo350sLQ7fDvSdXG-cMWrJW4SkAHehO1vZTtSkAxeMFDYYgtdK-FbOZxyn2gk_82n_Ae-9_telnFsMFtSpXm1iR7CHcqsiud5A4Cf9V-M69UfQXYzFTITDCMYnN_MtQv5c0WkJ4rXDZVUTgVO9u3npPMNoCueZuaCtxZZQWpD5R9A3JM=w323-h98-no?authuser=0"));

            hotelList.add(new Hotel("Balfagon","https://media-cdn.tripadvisor.com/media/photo-s/08/10/f6/09/hotel-spa-balfagon.jpg",
                    4.6f,"Cantavieja,Teruel,España","https://www.turismomaestrazgo.com/wp-content/uploads/2017/05/logowebmalema2.png"));

            hotelList.add(new Hotel("Fonda de la Estacion","https://turismogudarjavalambre.com/images/Establecimientos/Hotel-Fonda-Estacion/Hotel-fonda-estacion-02.jpg",
                    4.3f,"La Puebla de Valverde,Teruel,España","https://lh3.googleusercontent.com/hSzMim88cQoSTsCiJ9D27pUeeKlvhYn1tkFvPsWA7F6KuH250iRMAelCeqTR7SBMNPOScy3c4dgHd9EmiGzPwuarSo7CDZ-Q6ARqjYX2zxmLCCjRzi7GUP74gnwA7kJ3yfjALC7KIdHfFlSftgNON9Hkk1dKWHLyaN5SQPdARA6TuATDL6rFvLICfsMD4tdjX9J6wgGhDnW6TgptNZLpNPES_ukHPX1n7DwVAe4kzAJjBf4yMsIHSx5cWBBsXcemeveNp8noap30DNxSFKWpRvl3pQr_Z-INPMcxdByOECQKsCZyQa7B5J0ZnScAbhqr_YEtk6XNI73SZRtInt7stg-F36nZ_kRBB82-988evBTeKg7ZrIXsyzzsw5aqI2KAYYcoxRazxtRV0HKdG4ATe3FTh9DILBM9uETRYsZCNZck4BFwixSQzTeP-R2sMSwaJfl5uXw2RiPzyVoAIrmvix090Jk0qQJU38vWG5K6eoDb3z5su_0jPWxEXnzJlr5hmmqUhFrW-3Xm9q6wcXGnbNzty15EzEnm91fA-dT3zo350sLQ7fDvSdXG-cMWrJW4SkAHehO1vZTtSkAxeMFDYYgtdK-FbOZxyn2gk_82n_Ae-9_telnFsMFtSpXm1iR7CHcqsiud5A4Cf9V-M69UfQXYzFTITDCMYnN_MtQv5c0WkJ4rXDZVUTgVO9u3npPMNoCueZuaCtxZZQWpD5R9A3JM=w323-h98-no?authuser=0"));

            hotelList.add(new Hotel("Duque de Calabria","https://turismogudarjavalambre.com/templates/yootheme/cache/Duque-calabria-02-e1cf0282.webp",
                    4.5f,"Manzanera,Teruel,España","https://lh3.googleusercontent.com/hSzMim88cQoSTsCiJ9D27pUeeKlvhYn1tkFvPsWA7F6KuH250iRMAelCeqTR7SBMNPOScy3c4dgHd9EmiGzPwuarSo7CDZ-Q6ARqjYX2zxmLCCjRzi7GUP74gnwA7kJ3yfjALC7KIdHfFlSftgNON9Hkk1dKWHLyaN5SQPdARA6TuATDL6rFvLICfsMD4tdjX9J6wgGhDnW6TgptNZLpNPES_ukHPX1n7DwVAe4kzAJjBf4yMsIHSx5cWBBsXcemeveNp8noap30DNxSFKWpRvl3pQr_Z-INPMcxdByOECQKsCZyQa7B5J0ZnScAbhqr_YEtk6XNI73SZRtInt7stg-F36nZ_kRBB82-988evBTeKg7ZrIXsyzzsw5aqI2KAYYcoxRazxtRV0HKdG4ATe3FTh9DILBM9uETRYsZCNZck4BFwixSQzTeP-R2sMSwaJfl5uXw2RiPzyVoAIrmvix090Jk0qQJU38vWG5K6eoDb3z5su_0jPWxEXnzJlr5hmmqUhFrW-3Xm9q6wcXGnbNzty15EzEnm91fA-dT3zo350sLQ7fDvSdXG-cMWrJW4SkAHehO1vZTtSkAxeMFDYYgtdK-FbOZxyn2gk_82n_Ae-9_telnFsMFtSpXm1iR7CHcqsiud5A4Cf9V-M69UfQXYzFTITDCMYnN_MtQv5c0WkJ4rXDZVUTgVO9u3npPMNoCueZuaCtxZZQWpD5R9A3JM=w323-h98-no?authuser=0"));

            hotelList.add(new Hotel("Palacio de Allepuz","https://hospederiasdearagon.com/wp-content/uploads/2018/05/hospederia-allepuz-hab-1024x682.jpg",
                    4.4f,"Allepuz,Teruel,España","https://lh3.googleusercontent.com/hSzMim88cQoSTsCiJ9D27pUeeKlvhYn1tkFvPsWA7F6KuH250iRMAelCeqTR7SBMNPOScy3c4dgHd9EmiGzPwuarSo7CDZ-Q6ARqjYX2zxmLCCjRzi7GUP74gnwA7kJ3yfjALC7KIdHfFlSftgNON9Hkk1dKWHLyaN5SQPdARA6TuATDL6rFvLICfsMD4tdjX9J6wgGhDnW6TgptNZLpNPES_ukHPX1n7DwVAe4kzAJjBf4yMsIHSx5cWBBsXcemeveNp8noap30DNxSFKWpRvl3pQr_Z-INPMcxdByOECQKsCZyQa7B5J0ZnScAbhqr_YEtk6XNI73SZRtInt7stg-F36nZ_kRBB82-988evBTeKg7ZrIXsyzzsw5aqI2KAYYcoxRazxtRV0HKdG4ATe3FTh9DILBM9uETRYsZCNZck4BFwixSQzTeP-R2sMSwaJfl5uXw2RiPzyVoAIrmvix090Jk0qQJU38vWG5K6eoDb3z5su_0jPWxEXnzJlr5hmmqUhFrW-3Xm9q6wcXGnbNzty15EzEnm91fA-dT3zo350sLQ7fDvSdXG-cMWrJW4SkAHehO1vZTtSkAxeMFDYYgtdK-FbOZxyn2gk_82n_Ae-9_telnFsMFtSpXm1iR7CHcqsiud5A4Cf9V-M69UfQXYzFTITDCMYnN_MtQv5c0WkJ4rXDZVUTgVO9u3npPMNoCueZuaCtxZZQWpD5R9A3JM=w323-h98-no?authuser=0"));
            //3-Asociamos el adatador al recicle view
            adapterHotel= new MyHotelRecyclerViewAdapter(hotelList,getActivity());
            recyclerView.setAdapter(adapterHotel);

        }
        return view;
    }
}