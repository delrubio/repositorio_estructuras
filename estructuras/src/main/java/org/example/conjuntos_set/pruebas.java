package org.example.conjuntos_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class pruebas {
    public static void main(String[] args) {

        //los introduce de una manera random
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Agost FC");
        conjunto.add("Monnegre FC");
        conjunto.add("Gimnastic");
        conjunto.add("Jove FC");
        conjunto.add("Agost FC");
        conjunto.add("Novelda FC");

        System.out.println(conjunto);

        //los introduce en el orden en el que se los ha introducido
        Set<Integer> conjunto_adds = new LinkedHashSet<>();
        System.out.println("----------------------------");

        conjunto_adds.add(8);
        conjunto_adds.add(93);
        conjunto_adds.add(33);
        conjunto_adds.add(12);
        conjunto_adds.add(9);
        conjunto_adds.add(18);

        System.out.println(conjunto_adds);

        //los ordena según ascii, alfabeticamente...
        Set<String> conjuntos_orden = new TreeSet<>();
        System.out.println("----------------------------");

        conjuntos_orden.add("Solan de Cabras");
        conjuntos_orden.add("Bezoya");
        conjuntos_orden.add("Lanjarón");
        conjuntos_orden.add("Font Vella");
        conjuntos_orden.add("Bezoya");

        System.out.println(conjuntos_orden);

    }
}
