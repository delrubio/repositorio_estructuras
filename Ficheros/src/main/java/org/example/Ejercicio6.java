package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    static Scanner teclado = new Scanner(System.in);
    static File fichero = new File("src/main/resources/prueba.txt");

    public static void main(String[] args) {

        System.out.println("Dima una palabra: ");
        String pal = teclado.next();

        Map<String, Integer> mapita = new HashMap<>();

        try {
            Scanner lector = new Scanner(fichero);

            while (lector.hasNextLine()){
                String linea = lector.nextLine();
                String[] palabras = linea.split(",");

                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].matches(pal)){
                        mapita.put(pal, mapita.getOrDefault(pal, 0) + 1);
                    }
                }
            } lector.close();

        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        System.out.println("La palabra " + pal + " aparece " + mapita.get(pal) + " veces.");

    }

}
