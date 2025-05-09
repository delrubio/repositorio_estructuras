package org.example;

import java.io.File;
import java.util.Scanner;

public class Ejercicio5 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Dime en que carpeta quieres listar archivos: ");
        File carpeta = new File(teclado.next());

        normal(carpeta);
        complejo(carpeta);

    }

    public static void normal(File carpeta){

        File listaFich[] = carpeta.listFiles();

        if (listaFich != null && listaFich.length > 0){

            for (File fichero : listaFich){
                if (fichero.isFile() && fichero.getName().endsWith(".txt")){
                    System.out.println(fichero.getName() + " tiene un tamaño de " + fichero.length() + " bytes.");
                }
            }

        }else {
            System.out.println("El directorio no tiene ficheros dentro :(");
        }

    }

    public static void complejo(File carpeta){

        System.out.print("Que tipo de ficheros quieres listar: ");
        String tipo = teclado.next();

        File listaFich[] = carpeta.listFiles();

        if (listaFich != null && listaFich.length > 0){

            for (File fichero : listaFich){
                if (fichero.isFile() && fichero.getName().endsWith(tipo)){
                    System.out.println(fichero.getName() + " tiene un tamaño de " + fichero.length() + " bytes.");
                }
            }

        }else {
            System.out.println("El directorio no tiene ficheros dentro :(");
        }

    }

}
