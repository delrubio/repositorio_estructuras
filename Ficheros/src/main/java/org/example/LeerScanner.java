package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerScanner {

    public static void main(String[] args) {

        File fichero = new File("src/main/resources/prueba.txt");

        try {
            Scanner lector = new Scanner(fichero);

            while (lector.hasNextLine()){
                //recorre las lineas 1 por 1 no las coge de golpe
                String linea = lector.nextLine();
                //split de las palabras de la linea
                String[] palabras = linea.split(",");

                System.out.println("Alumn@: " + palabras[0] + ", nota " + palabras[1]);
            }

            lector.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
