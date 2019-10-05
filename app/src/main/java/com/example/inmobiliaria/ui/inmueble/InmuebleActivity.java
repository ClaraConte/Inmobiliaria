package com.example.inmobiliaria.ui.inmueble;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.inmobiliaria.R;
import com.example.inmobiliaria.data.inmueble.Inmueble;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class InmuebleActivity extends AppCompatActivity{
    private TextView price;
    private TextView address;
    private ImageView image;
    private TextView ambientes;
    private CheckBox checkBox;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inmueble);

        price = findViewById(R.id.precio);
        address = findViewById(R.id.direccion);
        ambientes = findViewById(R.id.ambientes);
        image = findViewById(R.id.foto);

        ArrayList<Inmueble> list = this.getIntent().getExtras().getParcelableArrayList("list");

        image.setImageResource(list.get(0).getFoto());

        address.setText("Dirección : "+list.get(0).getDireccion());
        price.setText("Precio :"+list.get(0).getPrecio()+"");
        ambientes.setText("Ambientes: 3");
        checkBox = findViewById(R.id.checkBoxDisponible);


        FloatingActionButton fab = findViewById(R.id.floatingEdit);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(checkBox.isChecked()){
                     Toast.makeText(getApplicationContext(),"Lapropiedad ha sido activada",Toast.LENGTH_LONG).show();
                 }else{Toast.makeText(getApplicationContext(),"Lapropiedad ha sido desactivada",Toast.LENGTH_LONG).show();}
            }
        });



    }
}