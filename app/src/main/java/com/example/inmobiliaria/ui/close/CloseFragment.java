package com.example.inmobiliaria.ui.close;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.inmobiliaria.NavigationActivity;
import com.example.inmobiliaria.R;

public class CloseFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_close, container, false);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());

        alertDialogBuilder.setTitle("Confirmar");

        alertDialogBuilder
                .setMessage("Realmente desea salir de la aplicación?")
                .setCancelable(false)
                .setPositiveButton("Si",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {

                        //Intent i = new Intent(getContext(), MainActivity.class);
                        //i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        //startActivity(i);

                        System.exit(0);
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {

                        dialog.cancel();

                        Intent i = new Intent(getContext(), NavigationActivity.class);
                        startActivity(i);
                    }
                }).create().show();

        return root;
    }
}