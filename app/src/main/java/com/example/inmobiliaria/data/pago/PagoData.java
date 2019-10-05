package com.example.inmobiliaria.data.pago;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PagoData {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> prop1 = new ArrayList<String>();

        prop1.add("Pago Nº : 1");
        prop1.add("Fecha : 10-01-2019");
        prop1.add("Importe : 11000");

        prop1.add("Pago Nº : 2");
        prop1.add("Fecha : 10-02-2019");
        prop1.add("Importe : 11000");

        prop1.add("Pago Nº : 3");
        prop1.add("Fecha : 10-03-2019");
        prop1.add("Importe : 11000");

        List<String> prop2 = new ArrayList<String>();
        prop2.add("Pago Nº : 1");
        prop2.add("Fecha : 10-02-2019");
        prop2.add("Importe : 18000");

        List<String> prop3 = new ArrayList<String>();
        prop3.add("Pago Nº : 1");
        prop3.add("Fecha : 10-03-2019");
        prop3.add("Importe : 17500");

        expandableListDetail.put("Propiedad: Mod 5 - M23 C11, La Punta, San Luis ", prop1);
        expandableListDetail.put("Propiedad: San juan 342, La Toma, San Luis", prop2);
        expandableListDetail.put("Propiedad: San Martin 345, San Luis, San Luis", prop3);
        return expandableListDetail;
    }
}

