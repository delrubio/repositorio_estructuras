package org.example;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File fichero = new File("src/main/resources/prueba.txt");

        if (fichero.exists()){
            System.out.println(fichero.getName() + ", sí que existe");
        }else {
            System.out.println("No que existe");
        }


        try {
            fichero.createNewFile();
        } catch (IOException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();
        }

        System.out.println("Tamaño del fichero: " + fichero.length());
        System.out.println("Ruta del fichero: " + fichero.getAbsolutePath());

        File carpeta = new File("src/main/resources/david");


        if (carpeta.exists()){
            System.out.println("La carpeta " + carpeta.getName() + " existe");
        }else{
            System.out.println("La carpeta no existe");
            carpeta.mkdir();
        }

        fichero.delete();

        if (fichero.exists()){
            System.out.println(fichero.getName() + ", sí que existe");
        }else {
            System.out.println(fichero.getName() + ", no existe");
        }

    }

}