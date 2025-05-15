package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Que fichero quieres contar sus palabras?");
        System.out.print("Introduce la ruta: ");
        String ruta = teclado.next();

        File fichero = new File(ruta);
        contarPalabras(fichero);

    }

    public static void contarPalabras(File fichero){

        try {
            Scanner lector = new Scanner(fichero);
            int cont = 0;

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] palabras = linea.split("[,.;: ]");

                for (int i = 0; i < palabras.length; i++) {
                    cont++;
                }

            }

            System.out.println("Tu fichero tiene " + cont + " palabras.");

        } catch (FileNotFoundException e) {
            System.out.println("Carechimba te saltó una excepción.");
            e.getMessage();
        }

    }

}
