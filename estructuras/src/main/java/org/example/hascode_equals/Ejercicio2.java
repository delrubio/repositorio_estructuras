package org.example.hascode_equals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ejercicio2 {

    static Random random = new Random();
    static Queue<Persona> cola = new LinkedList<>();

    public static void main(String[] args) {
        generarAleatorio();
        System.out.println("Hay " + cola.size() + " personas a la cola.");
        System.out.println("La recaudación total ha sido de " + pagarEntradas());
    }

    public static void generarAleatorio(){
        int num_personas = random.nextInt(251);

        for (int i = 0; i < num_personas; i++) {
            cola.offer(new Persona(random.nextInt(97)+3));
        }
    }

    public static double pagarEntradas(){
        double importe = 0;

        while(!cola.isEmpty()){
            importe += obtenerPrecio(cola.peek().getEdad());
            cola.poll();
        }

        return importe;
    }

    public static double obtenerPrecio(int edad){

        if (edad >= 1 || edad <= 10){
            return 1;
        } else if (edad > 10 || edad < 18){
            return 2.5;
        }else{
            return 3.5;
        }
    }
}
