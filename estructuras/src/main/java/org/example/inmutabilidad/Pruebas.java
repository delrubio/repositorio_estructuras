package org.example.inmutabilidad;

public class Pruebas {

    public static void main(String[] args) {

        Arbitro arbi = new Arbitro();
        arbi.getListaArbi().add("Pito Regalado");
        System.out.println(arbi);

    }
}
