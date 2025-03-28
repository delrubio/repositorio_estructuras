package org.example.comparadores;

import lombok.Getter;

import java.util.Comparator;
import java.util.Objects;

@Getter
public class Figuras implements Comparable<Figuras> {

    private String nombre;
    private Double superficie;

    public Figuras(String nombre, Double num){
        this.nombre=nombre;
        this.superficie =num;
    }

    @Override
    public String toString() {
        return "Figuras{" +
                "nombre='" + nombre + '\'' +
                ", num=" + superficie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figuras figuras = (Figuras) o;
        return Double.compare(superficie, figuras.superficie) == 0 && Objects.equals(nombre, figuras.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, superficie);
    }

    @Override
    public int compareTo(Figuras figura) {

        int resultadoComparar = nombre.compareTo(figura.getNombre());

        if (resultadoComparar!=0){
            return resultadoComparar;
        }

        return superficie.compareTo(figura.getSuperficie());
    }
}
