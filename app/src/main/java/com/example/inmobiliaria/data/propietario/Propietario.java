package com.example.inmobiliaria.data.propietario;

public class Propietario {

private String propietarioNombre;
private String propietarioApellido;
private String propietarioDni;
private String propietarioDomicilio;
private String propietarioTelefono;
private String prpietarioEmail;
private String propietarioPassword;

    public Propietario(String propietarioNombre, String propietarioApellido, String propietarioDni, String propietarioDomicilio, String propietarioTelefono, String prpietarioEmail, String propietarioPassword) {
        this.propietarioNombre = propietarioNombre;
        this.propietarioApellido = propietarioApellido;
        this.propietarioDni = propietarioDni;
        this.propietarioDomicilio = propietarioDomicilio;
        this.propietarioTelefono = propietarioTelefono;
        this.prpietarioEmail = prpietarioEmail;
        this.propietarioPassword = propietarioPassword;
    }

    public String getPropietarioNombre() {
        return propietarioNombre;
    }

    public void setPropietarioNombre(String propietarioNombre) {
        this.propietarioNombre = propietarioNombre;
    }

    public String getPropietarioApellido() {
        return propietarioApellido;
    }

    public void setPropietarioApellido(String propietarioApellido) {
        this.propietarioApellido = propietarioApellido;
    }

    public String getPropietarioDni() {
        return propietarioDni;
    }

    public void setPropietarioDni(String propietarioDni) {
        this.propietarioDni = propietarioDni;
    }

    public String getPropietarioDomicilio() {
        return propietarioDomicilio;
    }

    public void setPropietarioDomicilio(String propietarioDomicilio) {
        this.propietarioDomicilio = propietarioDomicilio;
    }

    public String getPropietarioTelefono() {
        return propietarioTelefono;
    }

    public void setPropietarioTelefono(String propietarioTelefono) {
        this.propietarioTelefono = propietarioTelefono;
    }

    public String getPrpietarioEmail() {
        return prpietarioEmail;
    }

    public void setPrpietarioEmail(String prpietarioEmail) {
        this.prpietarioEmail = prpietarioEmail;
    }

    public String getPropietarioPassword() {
        return propietarioPassword;
    }

    public void setPropietarioPassword(String propietarioPassword) {
        this.propietarioPassword = propietarioPassword;
    }
}
