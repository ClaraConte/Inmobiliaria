package com.example.inmobiliaria.data.inmueble;

import com.example.inmobiliaria.R;

import java.util.ArrayList;

public class InmuebleData {

    private ArrayList<Inmueble> lista = new ArrayList<Inmueble>();


    public ArrayList<Inmueble> getInmueble(){
        return lista;
    }

    public void addInmueble() {
        lista.add(new Inmueble(R.drawable.casa1, 11000, "La Punta, San Luis"));
        lista.add(new Inmueble(R.drawable.casa2, 18000, "La Toma, San Luis"));
        lista.add(new Inmueble(R.drawable.casa3, 17500, "San Luis, San Luis"));
    }
}