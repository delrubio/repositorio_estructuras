package org.example.colas;

import java.util.LinkedList;
import java.util.Queue;

public class ejercicios_inicio {
    public static void main(String[] args) {
        ejer2();
    }

    public static void ejer1(){
        Queue<Character> cola_char = new LinkedList<>();

        cola_char.offer('A');
        cola_char.offer('B');
        cola_char.offer('C');
        cola_char.offer('D');
        cola_char.offer('E');

        if(cola_char.isEmpty()){
            System.out.println("VACÍA");
        }else{
            System.out.println("CON OBJETOS");
        }

        System.out.println(cola_char.size());

        System.out.println(cola_char.peek());

        while(!cola_char.isEmpty()){
            System.out.println(cola_char.poll());
        }
    }

    public static void ejer2(){

        Queue<String> documentos = new LinkedList<>();

        documentos.offer("Doc 1");
        documentos.offer("Doc 2");
        documentos.offer("Doc 3");
        documentos.offer("Doc 4");
        documentos.offer("Doc 5");

        while (!documentos.isEmpty()){
            System.out.println("Estado de la Impresora: " + documentos);
            System.out.println("Procesando imprimir el documento: " + documentos.poll());
        }
    }
    
}
