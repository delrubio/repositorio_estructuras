package org.example;

import java.io.*;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el fichero: ");
        String ruta = teclado.next();

        File fichero = new File(ruta);
        File ficheroTmp = new File("src/main/resources/tmp/writer.tmp");

        if (!ficheroTmp.exists()){
            try {
                ficheroTmp.createNewFile();
            } catch (IOException e) {
                e.getMessage();
            }
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero));
            BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroTmp));

            String linea;
            while ((linea = reader.readLine()) != null){
                String[] palabras = linea.split("[ ]");

                for (String pal : palabras){
                    char[] caracteres = pal.toCharArray();
                    writer.write(Character.toString(caracteres[0]).toUpperCase());

                    for (int i = 1; i < caracteres.length; i++) {
                        writer.write(Character.toString(caracteres[i]));
                    }

                    writer.write(" ");
                }
                writer.close();

            }

        } catch (IOException e) {
            e.getMessage();
        }


    }

}
