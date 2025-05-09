package org.example;

import java.io.File;

public class Listar {

    public static void main(String[] args) {

        File carpeta = new File("src/main/resources");


        //1º Listar los Nombres.
        String ficheros[] = carpeta.list();

        if (ficheros != null && ficheros.length > 0){

            for (String fichero : ficheros){
                System.out.println(fichero);
            }

        }else {
            System.out.println("El directorio está vacío.");
        }


        //2º Listar objetos de tipo File
        File listaFich[] = carpeta.listFiles();

        if (listaFich != null && listaFich.length > 0){

            for (File fichero : listaFich){
                if (fichero.isFile()){
                    System.out.println(fichero.getName() + " tiene un tamaño de " + fichero.length() + " bytes.");
                }
            }

        }else {
            System.out.println("El directorio no tiene ficheros dentro :(");
        }


    }

}
