package com.example.inmobiliaria.data.inmueble;

import android.os.Parcel;
import android.os.Parcelable;


public class Inmueble implements Parcelable {

    private int foto;
    private double precio;
    private String direccion;

    public Inmueble(int foto, double precio, String direccion) {
        this.foto = foto;
        this.precio = precio;
        this.direccion = direccion;
    }

    protected Inmueble(Parcel in) {
        foto = in.readInt();
        precio = in.readDouble();
        direccion = in.readString();
    }

    public static final Creator<Inmueble> CREATOR = new Creator<Inmueble>() {
        @Override
        public Inmueble createFromParcel(Parcel in) {
            return new Inmueble(in);
        }

        @Override
        public Inmueble[] newArray(int size) {
            return new Inmueble[size];
        }
    };

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(foto);
        parcel.writeDouble(precio);
        parcel.writeString(direccion);
    }
}