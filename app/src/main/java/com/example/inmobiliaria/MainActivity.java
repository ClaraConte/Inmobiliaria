package com.example.inmobiliaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.inmobiliaria.data.propietario.PropietarioData;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText usuario;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.login);
        usuario = findViewById(R.id.editTextUser);
        password = findViewById(R.id.editTextPass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            // Equivalente a crear una clase que implemente la interfaz y luego enviar el objeto de la misma como parametro
            @Override
            public void onClick(View view) {

                PropietarioData propietario = new PropietarioData();
                propietario.addPropietario();
                if(usuario.getText().toString().equals(propietario.getPropietario().getPrpietarioEmail()) && password.getText().toString().equals(propietario.getPropietario().getPropietarioPassword())) {

                    Intent i = new Intent(getApplicationContext(), NavigationActivity.class);
                    i.putExtra("nombre", propietario.getPropietario().getPropietarioNombre());
                    i.putExtra("email", propietario.getPropietario().getPrpietarioEmail());
                    startActivity(i);

                }else{
                    Toast.makeText(getApplicationContext(),"Usuario y/o password incorrecto",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
