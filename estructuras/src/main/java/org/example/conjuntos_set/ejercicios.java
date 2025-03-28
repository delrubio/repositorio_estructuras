package org.example.conjuntos_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ejercicios {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejer1();
    }

    public static void ejer1(){
        System.out.println("Dime una frase: ");

        Set<String> frase = new HashSet<>();
        String palabras = teclado.nextLine().toLowerCase();

        String[] palabra = palabras.split(" ");

        for (int i = 0; i < palabra.length; i++) {
            frase.add(palabra[i]);
        }

        System.out.println(frase);

    }

    public static void ejer2(){

        Set<String> historial = new HashSet<>();
        boolean bol = true;

        do {

            System.out.println("Escribe una URL visitada (o 'salir' para terminar)");

            if (teclado.next().equals("salir")){
                bol=false;
            }else {
                bol=true;
            }

            historial.add(teclado.next());

        }while (bol);

        System.out.println(historial);
    }

    public static void ejer4(){

        Set<Integer> list1 = new TreeSet<>();
        Set<Integer> list2 = new TreeSet<>();
        Set<Integer> list3 = new TreeSet<>();

        System.out.println("Rellena la primera lista: ");





        do {
            list1.add(teclado.nextInt());
        }while(teclado.nextInt()!=0);

        do {
            list2.add(teclado.nextInt());
        }while(teclado.nextInt()!=0);



        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println(list3);

    }
}
