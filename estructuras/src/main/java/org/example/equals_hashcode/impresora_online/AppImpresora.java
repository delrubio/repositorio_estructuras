package org.example.equals_hashcode.impresora_online;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppImpresora {

    public static final String ID_PC="PC1234";
    static LinkedHashSet<Peticion> colaPeticiones = new LinkedHashSet<>();

    public static void main(String[] args) {

        anyadirDocumento("prueba.pdf");
        anyadirDocumento("prueba.pdf");
        anyadirDocumento("facturas2025.pdf");
        anyadirDocumento("contabilidad_2025.txt");
        anyadirDocumento("contabilidad_2025.pdf");
        anyadirDocumento("facturas2024.pdf");


        imprimirDocumento();
        System.out.println("Quedan " + getNumPeticiones() + " peticiones en la cola.");

        System.out.println(colaPeticiones);

        verTodo();
        imprimirTodo();
    }

    public static void anyadirDocumento(String nombre_docu){
        if (nombre_docu.endsWith(".pdf")){
            if(colaPeticiones.add(new Peticion(ID_PC, nombre_docu))){
                System.out.println("Archivo en cola...");
            }else{
                System.out.println("El archivo " + nombre_docu + " ya está en la cola de impresión.");
            }
        }else{
            System.out.println("El archivo " + nombre_docu + " no tiene el formato correcto.");
        }
    }

    public static void imprimirDocumento(){
        System.out.println("Imprimiendo... " + colaPeticiones.removeFirst().getNombre_archivo());
    }

    public static int getNumPeticiones(){
        return colaPeticiones.size();
    }

    public static void verTodo(){
        System.out.println("Cola impresión: " + colaPeticiones);
    }

    public static void imprimirTodo(){
        while(!colaPeticiones.isEmpty()){
            imprimirDocumento();
        }

        System.out.println("La cola ha finalizado.");
    }
}
