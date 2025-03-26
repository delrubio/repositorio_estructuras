package org.example.iteradores;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class EjercicioMaria {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dime algo: ");
        String texto = teclado.nextLine();

        LinkedList<Character> letritas = new LinkedList<>();
        ListIterator<Character> itLetritas = letritas.listIterator();

        for(char c: texto.toCharArray()){
            switch (c){
                case '<':
                    //si hay previo me muevo a la derecha
                    if (itLetritas.hasPrevious()){
                        itLetritas.previous();
                    }
                    break;
                case '>':
                    //si hay siguiente me muevo al siguiente
                    if (itLetritas.hasNext()){
                        itLetritas.next();
                    }
                    break;
                case '#':
                    //si hay previo, primeor me muevo al previo y luego lo borro, siempre tienes que
                    // estar en una posicion para poder hacer algo, el iterador tiene que estar cargado
                    if (itLetritas.hasPrevious()){
                        itLetritas.previous();
                        itLetritas.remove();
                    }
                    break;
                default:
                    itLetritas.add(c);
                    break;
            }
        }

        for (char c: letritas){
            System.out.print(c);
        }

    }

}
