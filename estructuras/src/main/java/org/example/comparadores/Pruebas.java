package org.example.comparadores;

import java.util.*;

public class Pruebas {
    public static void main(String[] args) {

        LinkedList<Integer> numero = new LinkedList<>(Arrays.asList(1,8,6,74,15));

        Collections.sort(numero);
        System.out.println(numero);
        Collections.reverse(numero);
        System.out.println(numero);

        List<Figuras> figurasList = new ArrayList<>();
        figurasList.add(new Figuras("Circulo", 4.0));
        figurasList.add(new Figuras("Cuadrado", 23.0));
        figurasList.add(new Figuras("Pentágino", 12.0));
        figurasList.add(new Figuras("Triangulo", 9.0));

        Collections.sort(figurasList, new CompararPorNombre());
        //Como la clase figuras no tiene comparadores, le pasamos la lista y le damos una clase con la que
        // si tenemos el comparator para que haga los calculos. La propia clase ya tiene el tipo de objeto.
        System.out.println(figurasList);
        Collections.sort(figurasList, new CompararPorNombre().reversed());
        //Para objetos, para ordenarlo al revés escribimos reversed()
        System.out.println(figurasList);


        Collections.sort(figurasList, Collections.reverseOrder());
        //Como la lase tiene comparable, puedo hacer el reverseOrder



        //COMPARATOR: Para hacer mas de un tipo de comparaciones, Strings, int, doubles...

        //COMPARABLE: Para hacer una unica clase comparable siempre con el mismo orden.

    }
}
