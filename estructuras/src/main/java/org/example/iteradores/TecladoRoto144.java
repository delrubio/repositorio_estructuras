package org.example.iteradores;

import java.util.LinkedList;
import java.util.ListIterator;

public class TecladoRoto144 {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            String texto = in.nextLine();

            LinkedList<Character> cadena = new LinkedList<>();
            ListIterator<Character> itCadena = cadena.listIterator();

            for (char c: texto.toCharArray()){
                switch (c){
                    case '-':
                        while (itCadena.hasPrevious()){
                            itCadena.previous();
                        }
                        break;
                    case '+':
                        while (itCadena.hasNext()){
                            itCadena.next();
                        }
                        break;
                    case '*':
                        if (itCadena.hasNext()){
                            itCadena.next();
                        }
                        break;
                    case '3':
                        if (itCadena.hasNext()){
                            itCadena.next();
                            itCadena.remove();
                        }
                        break;
                    default:
                        itCadena.add(c);
                        break;
                }
            }

            for (char c: cadena){
                System.out.print(c);
            }

            // (incluyendo la lectura del caso de prueba)
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
