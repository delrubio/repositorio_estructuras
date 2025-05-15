package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

    public static void main(String[] args) {

        try {
            BufferedWriter escribir = new BufferedWriter(new FileWriter("src/main/resources/prueba.txt"));
            escribir.write("David bueno vs David malo");
            escribir.newLine();
            escribir.write("Nissan Patrol Super Safari");
            escribir.close();
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.getMessage();
        }

    }

}
