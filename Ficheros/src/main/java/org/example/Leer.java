package org.example;

import java.io.*;

public class Leer {

    public static void main(String[] args) {

        try {
            BufferedReader leer = new BufferedReader(new FileReader("src/main/resources/prueba.txt"));
            String linea;

            while ((linea = leer.readLine()) != null){
                System.out.println(linea);
            }

            leer.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal");
            e.getMessage();
        }

    }

}
