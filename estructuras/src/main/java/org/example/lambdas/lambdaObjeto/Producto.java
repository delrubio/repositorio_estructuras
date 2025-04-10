package org.example.lambdas.lambdaObjeto;

import lombok.Getter;

@Getter
public class Producto {

    private String nombre;
    private double precio;
    private String categoria;


    public Producto(String nombre, double precio, String categoria){
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
