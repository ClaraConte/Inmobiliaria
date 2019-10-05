package com.example.inmobiliaria.data.contrato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContratoData {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> prop1 = new ArrayList<String>();
        prop1.add("Detalle Contrato");
        prop1.add("Fecha inicio : 01-01-2019");
        prop1.add("Fecha fin : 01-01-2021");
        prop1.add("Precio : 11000");

        List<String> prop2 = new ArrayList<String>();
        prop2.add("Detalle Contrato");
        prop2.add("Fecha inicio : 01-01-2019");
        prop2.add("Fecha fin : 01-01-2021");
        prop2.add("Precio : 18000");

        List<String> prop3 = new ArrayList<String>();
        prop3.add("Detalle Contrato");
        prop3.add("Fecha inicio : 01-01-2019");
        prop3.add("Fecha fin : 01-01-2021");
        prop3.add("Precio : 17500");

        expandableListDetail.put("Propiedad: Mod 5 - M23 C11, La Punta, San Luis ", prop1);
        expandableListDetail.put("Propiedad: San juan 342, La Toma, San Luis", prop2);
        expandableListDetail.put("Propiedad: San Martin 345, San Luis, San Luis", prop3);
        return expandableListDetail;
    }
}
