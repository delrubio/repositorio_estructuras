package org.example.iteradores;

import lombok.Data;

@Data
public class Empresa {

    private String nombre;
    private int empleados;

    public Empresa(String nombre, int empleados){
        this.nombre=nombre;
        this.empleados=empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
