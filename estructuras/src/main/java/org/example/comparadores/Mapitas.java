package org.example.comparadores;

import java.util.*;

public class Mapitas {

    public static void main(String[] args) {

        HashMap<String, Double> carta_cubatas = new HashMap<>();
        carta_cubatas.put("Wichinau", 7.0);
        carta_cubatas.put("Ron Cola", 8.0);
        carta_cubatas.put("Gintonic", 10.5);

        List<Map.Entry<String, Double>> listaMapa = new ArrayList<>(carta_cubatas.entrySet());
        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //Ordenar en orden del valor del mapa

        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //Ordena en el orden reverso los mapas 

        for (Map.Entry<String, Double> mapa : listaMapa){
            System.out.println("Nombre " + mapa.getKey() + ", Precio: " + mapa.getValue());
        }

    }

}
