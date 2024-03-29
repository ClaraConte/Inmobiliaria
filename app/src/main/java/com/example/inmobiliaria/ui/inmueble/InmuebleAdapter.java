package com.example.inmobiliaria.ui.inmueble;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.inmobiliaria.R;
import com.example.inmobiliaria.data.inmueble.Inmueble;

import java.util.List;

public class InmuebleAdapter extends ArrayAdapter <Inmueble> {

    private Context context;
    private List<Inmueble> lista;
    private LayoutInflater li;

    public InmuebleAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li = li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        Inmueble inmueble = lista.get(position);

        if(itemView == null){
            itemView = li.inflate(R.layout.inmueble_item,parent,false);
        }

        ImageView foto = itemView.findViewById(R.id.foto);
        foto.setImageResource(inmueble.getFoto());

        TextView direccion = itemView.findViewById(R.id.direccion);
        direccion.setText(inmueble.getDireccion());

        TextView precio = itemView.findViewById(R.id.precio);
        precio.setText(inmueble.getPrecio()+"");

        return itemView;
    }
}