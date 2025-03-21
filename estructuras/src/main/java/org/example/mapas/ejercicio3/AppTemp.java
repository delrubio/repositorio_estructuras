package org.example.mapas.ejercicio3;

public class AppTemp {
    public static void main(String[] args) {
        RegistroTemperaturas temp1 = new RegistroTemperaturas();

        temp1.insertar("Alicante", 26.0);
        temp1.insertar("Xixona", 21.7);
        temp1.insertar("Benidorm", 16.9);

        temp1.consultar();

        temp1.verTodas();
    }
}
