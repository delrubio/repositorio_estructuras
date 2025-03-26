package org.example.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Pruebas_ListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> edades = new ArrayList<>(Arrays.asList(1,5,16,87,23,17,34));

        ListIterator<Integer> itEdades = edades.listIterator();

        System.out.println("Hacia adelante:");
        while (itEdades.hasNext()){
            System.out.println(itEdades.next());
        }

        System.out.println("Hacia detrás");
        while (itEdades.hasPrevious()){
            System.out.println(itEdades.previous());
        }

        //lista hacia atrás desde el inicio
        ListIterator<Integer> itEdades2 = edades.listIterator(edades.size());
        System.out.println("Hacia detrás desde inicio");
        while (itEdades2.hasPrevious()){
            int num = itEdades2.previous();
            if (num<18) {
                itEdades2.set(100);
            }
        }
                  System.out.println(edades);

    }
}
