package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una frase: ");
        String frase = teclado.next();

        String[] palabras = frase.split(" ");
        Map<String, Integer> mapaPalabras = new HashMap<>();

        for (String palabra : palabras){
            mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra, 0) +1);
            //coge la clave, y si luego buscando la clave no la encuentra la pone a 0, si no le suma +1
        }

        for (Map.Entry<String, Integer> palabra : mapaPalabras.entrySet()){
            System.out.println(palabra.getKey() + " " + palabra.getValue());
        }

    }
}
