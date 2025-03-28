package org.example.Programame;

import java.util.*;

public class SEGUNDO {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {

            String nums = in.nextLine();

            String[] vector = nums.split(" ");

            TreeSet<Integer> listaNums = new TreeSet<>();

            for (String num : vector) {
                listaNums.add(Integer.parseInt(num));
            }

            System.out.print(listaNums.getFirst());
            System.out.print(listaNums.getLast());

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
