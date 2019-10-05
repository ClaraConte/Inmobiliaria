package com.example.inmobiliaria.ui.propietario;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.inmobiliaria.NavigationActivity;
import com.example.inmobiliaria.R;
import com.example.inmobiliaria.data.propietario.Propietario;
import com.example.inmobiliaria.data.propietario.PropietarioData;

public class PropietarioFragment extends Fragment {

    private EditText nombre;
    private EditText apellido;
    private EditText dni;
    private EditText domicilio;
    private EditText telefono;
    private EditText email;
    private EditText password;
    private Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_propietario, container, false);

        nombre = root.findViewById(R.id.name);
        apellido = root.findViewById(R.id.last_name);
        dni = root.findViewById(R.id.editDni);
        domicilio = root.findViewById(R.id.editAddress);
        telefono = root.findViewById(R.id.editTel);
        email = root.findViewById(R.id.editEmail);
        password = root.findViewById(R.id.edit_pass);
        button = root.findViewById(R.id.btn_edit);

        getDatosPropietario();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());

                alertDialogBuilder.setTitle("Confirmar");

                alertDialogBuilder
                    .setMessage("Desea aplicar los cambios?")
                    .setCancelable(false)
                    .setPositiveButton("Si",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {

                        Toast.makeText(getContext(),"Datos editados",Toast.LENGTH_LONG).show();

                        }
                    })
                    .setNegativeButton("No",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            Toast.makeText(getContext(),"No se editaron los datos",Toast.LENGTH_LONG).show();
                            dialog.cancel();
                        }
                    }).create().show();
            }
        });

        return root;
    }

    public void getDatosPropietario(){
        PropietarioData propietarioData = new PropietarioData();
        propietarioData.addPropietario();

        nombre.setText(propietarioData.getPropietario().getPropietarioNombre());
        apellido.setText(propietarioData.getPropietario().getPropietarioApellido());
        dni.setText(propietarioData.getPropietario().getPropietarioDni());
        domicilio.setText(propietarioData.getPropietario().getPropietarioDomicilio());
        telefono.setText(propietarioData.getPropietario().getPropietarioTelefono());
        email.setText(propietarioData.getPropietario().getPrpietarioEmail());
        password.setText(propietarioData.getPropietario().getPropietarioPassword());
    }
}