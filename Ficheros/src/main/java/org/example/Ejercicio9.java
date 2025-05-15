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
                String[] palabras = linea.split("[,.;: ]");
                System.out.println(palabras);

                for (int i = 0; i < palabras.length; i++) {
                    char[] caracteres = palabras[i].toCharArray();
                    System.out.println(caracteres);
                    
                    for (int j = 0; j < caracteres.length; j++) {
                        String letra;
                        if (i == 0){
                            letra = Character.toString(caracteres[i]);
                            writer.write(letra.toUpperCase());
                        }else{
                            letra = Character.toString(caracteres[i]);
                            writer.write(letra);
                        }
                    }
                    writer.write(" ");
                }

            }

        } catch (IOException e) {
            e.getMessage();
        }


    }

}
