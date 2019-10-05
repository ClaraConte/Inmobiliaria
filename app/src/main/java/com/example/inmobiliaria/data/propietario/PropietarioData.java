package com.example.inmobiliaria.data.propietario;

public class PropietarioData {
    private Propietario propietario;


    public Propietario getPropietario(){
        return propietario;
    }

    public void addPropietario() {
        propietario = new Propietario("Clara", "Conte", "3244532",
                "La punta mod-6","26155252","clara@clara.com","1234");
    }

    public void addPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
