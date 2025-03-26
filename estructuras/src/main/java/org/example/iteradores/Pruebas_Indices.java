package org.example.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Pruebas_Indices {
    public static void main(String[] args) {

        ArrayList<Integer> numeritos = new ArrayList<>(Arrays.asList(12,23,1,8,45));

        ListIterator<Integer> itNumeritos = numeritos.listIterator();

        //sin moverme
        System.out.println(itNumeritos.nextIndex());
        System.out.println(itNumeritos.previousIndex());

        //avanzo
        itNumeritos.next();
        System.out.println(itNumeritos.nextIndex());
        System.out.println(itNumeritos.previousIndex());

        //final
        itNumeritos.next();
        itNumeritos.next();
        itNumeritos.next();
        itNumeritos.next();
        System.out.println(itNumeritos.nextIndex());
        System.out.println(itNumeritos.previousIndex());

    }
}
