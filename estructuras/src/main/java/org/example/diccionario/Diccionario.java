package org.example.diccionario;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {

    static Scanner teclado = new Scanner(System.in);
    static Random random = new Random();
    static HashMap<String, String> diccionarioPalabras = new HashMap<>();

    public static void main(String[] args) {

        diccionarioPalabras.put("Perro", "Dog");
        diccionarioPalabras.put("Gato", "Cat");
        diccionarioPalabras.put("Pajaro", "Berd");
        diccionarioPalabras.put("Tigre", "Tiger");
        diccionarioPalabras.put("Elefante", "Elephant");
        diccionarioPalabras.put("Ballena", "Wale");
        diccionarioPalabras.put("Tiburon", "Shark");

        menu();

    }

    public static void menu(){

        System.out.println("¿Que quieres hacer?");
        System.out.println("-------------------");
        System.out.println("1. Añadir Palabras");
        System.out.println("2. Buscar una palabra");
        System.out.println("3. Palabra Aleatoria");
        System.out.println("4. ¡Jugar a Adivinar!");

        int opc = teclado.nextInt();

        switch (opc){
            case 1:
                nuevoPar();
                break;
            case 2:
                traduce();
                break;
            case 3:
                palabraAleatoria();
                break;
           case 4:
                primeraLetraTraduccion();
                break;
           default:
                System.exit(1);
        }
    }

    public static void nuevoPar(){
        System.out.print("Introduce un nuevo par: ");
        String[] par = teclado.nextLine().split(" ");

        diccionarioPalabras.put(par[0], par[1]);

        System.out.println("Añadido con EXITO!");
        menu();

    }

    public static void traduce(){
        System.out.print("Que quieres buscar: ");
        String palabra = teclado.next();

        System.out.println("Resultados para la busqueda: " + palabra + " - " + diccionarioPalabras.get(palabra));
    }

    public static void palabraAleatoria(){
        System.out.println("Pala aleatoria.... ");

        String[] palabra = diccionarioPalabras.keySet().toArray(new String[0]);

        System.out.println(palabra[3]);
    }

    public static void primeraLetraTraduccion(){

        String opc = "";
        int contB = 0;
        int contM = 0;
        int contP = 0;

        while(!opc.matches("fin")) {
            char[] letra;

            for (String letras : diccionarioPalabras.keySet()) {
                letra = diccionarioPalabras.get(letras).toCharArray();

                System.out.println(letras + ": " + letra[0] + "...");
                opc = teclado.next();

                if (opc.matches(diccionarioPalabras.get(letras))){
                    System.out.println("¡CORRECTO!");
                    contB++;
                } else if (opc.matches("fin")) {
                    break;
                } else {
                    System.out.println("¡NO! La respuesta es " + letras);
                    contM++;
                }

                contP++;
            }
        }

        System.out.println("FIN DEL JUEGO.");
        System.out.println("Total de preguntas: " + contP);
        System.out.println("Total de válidas: " + contB);
        System.out.println("Total de inválidas: " + contM);

    }


}
