package org.example.lambdas;

import org.example.lambdas.lambdaObjeto.Profesor;

import java.lang.reflect.Array;
import java.util.*;

public class Ordenaciones {

    public static void main(String[] args) {

        List<String> listaCiudades = new ArrayList<>(Arrays.asList("Alicante", "Relleu", "Guadalest", "Benidorm"));

        listaCiudades.sort(Comparator.comparing(s -> s));
//        Collections.sort(listaCiudades, (a,b) -> a.compareTo(b));
        System.out.println(listaCiudades);

        Profesor patri = new Profesor("Patricia", "Programacion", 34);
        Profesor paco = new Profesor("Paco", "Sistemas", 54);
        Profesor viky = new Profesor("Victoria", "SQL", 52);

        List<Profesor> profesorList = new ArrayList<>(Arrays.asList(paco, patri, viky));


        profesorList.sort(Comparator.comparing(profesor -> profesor.getNombre()));
        System.out.println(profesorList);


        profesorList.sort(Comparator.comparing(Profesor::getNombre).thenComparing(Profesor::getEdad));
        System.out.println(profesorList);


        Collections.sort(profesorList, (profe1, profe2) -> profe1.getNombre().compareTo(profe2.getNombre()));
        System.out.println(profesorList);
    }

}