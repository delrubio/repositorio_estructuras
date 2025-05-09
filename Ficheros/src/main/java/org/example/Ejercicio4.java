package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Dime cuantos ficheros quieres crear: ");
        int n = teclado.nextInt();
        System.out.print("En que ruta quieres guardar el archivo: ");
        teclado.nextLine();
        String carpeta = teclado.next();

        File comprobar_carpeta = new File(carpeta);
        if (comprobar_carpeta.exists()){

            for (int i = 1; i <= n; i++) {
                File fichero = new File(carpeta + "/nombre(" + i + ").txt");
                try {
                    fichero.createNewFile();
                    System.out.println("Fichero " + fichero.getName() + " creado correctamente :)");
                } catch (IOException e) {
                    System.out.println("Espabila, esto no va");
                    e.printStackTrace();
                }
            }

        }else {
            System.out.println("La ruta no existe pringadillo... :/");
        }

    }
}
