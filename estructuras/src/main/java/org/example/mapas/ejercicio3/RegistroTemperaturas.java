package org.example.mapas.ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {

    private Map<String, Double> mapaTemp;
    Scanner teclado = new Scanner(System.in);

    public RegistroTemperaturas(){
        mapaTemp = new HashMap<>();
    }

    public void insertar(String ciudad, Double temperatura){
        mapaTemp.put(ciudad, temperatura);
        System.out.println("Temperatura añadida. " + ciudad + " a " + temperatura + "Cº");
    }

    public void actualizar(String ciudad){

        System.out.println("¿Que temperatura hace ahora?");
        Double temperatura = teclado.nextDouble();

        mapaTemp.put(ciudad, temperatura);
        System.out.println("Temperatura actualizada: " + ciudad + " a " + temperatura + "Cº");
    }

    public void consultar(){

        System.out.println("¿Que ciudad quieres consultar?");
        String ciudad = teclado.next();

        if (!mapaTemp.containsKey(ciudad)){
            System.out.println("No existe esta ciudad.");
        }else {
            System.out.println("Temperatura en " + ciudad + " "+ mapaTemp.get(ciudad));
        }

    }

    public void verTodas(){

        for (Map.Entry<String, Double> mapa : mapaTemp.entrySet()){
            System.out.println(mapa.getKey() + " " + mapa.getValue() + "Cº");
        }

    }

}
