package com.example.inmobiliaria.data.inquilino;

import com.example.inmobiliaria.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InquilinoData {

        public static HashMap<String, List<String>> getData() {
            HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

            List<String> prop1 = new ArrayList<String>();
            prop1.add("Datos Inquilino");
            prop1.add("Nombre : Nicolás");
            prop1.add("Apellido : José");
            prop1.add("Dni : 2384848");
            prop1.add("Dirección : Las heras 3234, San martín");
            prop1.add("Teléfono : 26648987764");

            List<String> prop2 = new ArrayList<String>();
            prop2.add("Datos Inquilino");
            prop2.add("Nombre : Sofía");
            prop2.add("Apellido : Conte");
            prop2.add("Dni : 48374664");
            prop2.add("Dirección : Granaderos 9847, Ciudad");
            prop2.add("Teléfono : 2664873764");

            List<String> prop3 = new ArrayList<String>();
            prop3.add("Datos Inquilino");
            prop3.add("Nombre : Marcelo");
            prop3.add("Apellido : Ríos");
            prop3.add("Dni : 248739490");
            prop3.add("Dirección : Cerro Acongagua 2323, Potrero de los funes");
            prop3.add("Teléfono : 266176543");

            expandableListDetail.put("Propiedad: Mod 5 - M23 C11, La Punta, San Luis ", prop1);
            expandableListDetail.put("Propiedad: San juan 342, La Toma, San Luis", prop2);
            expandableListDetail.put("Propiedad: San Martin 345, San Luis, San Luis", prop3);
            return expandableListDetail;
        }
}
