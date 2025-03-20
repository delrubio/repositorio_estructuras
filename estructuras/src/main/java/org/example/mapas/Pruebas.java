package org.example.mapas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {
    public static void main(String[] args) {

        HashMap<String, Integer> mapaNotas = new HashMap<>();

        mapaNotas.put("Ismael", 2);
        mapaNotas.put("David", 6);
        mapaNotas.put("Izan", 1);
        mapaNotas.put("Cesar", 8);

        System.out.println(mapaNotas);

        mapaNotas.put("Ismael", 1);
        System.out.println("Nota cambiada de Isamel: " + mapaNotas.get("Ismael"));

        mapaNotas.remove("Izan");
        System.out.println(mapaNotas);

        if (mapaNotas.containsKey("Cesar")){
            System.out.println("Si existe!");
        }

        if (mapaNotas.containsValue(10)){
            System.out.println("Alguien tiene un 10");
        }

        System.out.println(mapaNotas.keySet());
        System.out.println(mapaNotas.values());

        for (String claves : mapaNotas.keySet()){
            System.out.println("Clave: " +  claves);
        }

        for (Integer valores : mapaNotas.values()){
            System.out.println("Valores: " + valores);
        }

        for (Map.Entry<String, Integer> mapa : mapaNotas.entrySet()){
            System.out.println(mapa.getKey() + " nota: " + mapa.getValue());
        }

    }
}
