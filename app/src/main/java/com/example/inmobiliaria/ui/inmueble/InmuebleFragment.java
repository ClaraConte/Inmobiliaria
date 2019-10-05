package com.example.inmobiliaria.ui.inmueble;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.inmobiliaria.R;
import com.example.inmobiliaria.data.inmueble.Inmueble;
import com.example.inmobiliaria.data.inmueble.InmuebleData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class InmuebleFragment extends Fragment {

    private ArrayList<Inmueble> lista;
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Carga datos de inmuebles crea una lista con ellos
        InmuebleData data = new InmuebleData();
        data.addInmueble();
        lista = data.getInmueble();

        // Crea vista contenedora de fragment
        root = inflater.inflate(R.layout.fragment_inmueble, container, false);

        // Boton flotante agregar propiedades
        FloatingActionButton fab = root.findViewById(R.id.floatingAdd);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Llamar a otra activity que me permita Agregar propiedades", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Carga vista contenedora con el ListView
        final ListView listView = root.findViewById(R.id.myList);

        // crea un inmueble_item para cada elemento de la lista asignados
        ArrayAdapter<Inmueble>  adapter = new InmuebleAdapter(getContext(), R.layout.inmueble_item, lista, getLayoutInflater());
        listView.setAdapter(adapter);

        // Crea un listener para cada elemento
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            LayoutInflater inflater;

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ArrayList<Inmueble> list= new ArrayList<Inmueble>();
                list.add(lista.get((int)id));

                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("list", list);

                Intent i = new Intent(getContext(), InmuebleActivity.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        return root;
    }
}
