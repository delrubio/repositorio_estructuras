package org.example.colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ejercicios_inicio {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejer4();
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

    public static void ejer3(){

        Queue<String> canciones = new LinkedList<>();
        canciones.offer("El último día de nuestras vida - Dani Martín");
        canciones.offer("Caminando por la vida - Melendi");
        canciones.offer("Bulería - David Bisbal");
        canciones.offer("Bohemian Rapsody - Queen");
        canciones.offer("Rosas - La Oreja de Van Gogh");

        System.out.println("Estado inicial de la PlayList: " + canciones);

        while(!canciones.isEmpty()){
            System.out.println("Reproduciendo... " + canciones.poll());
            System.out.println("Estado de la PlayList: " + canciones);
        }
    }

    public static void ejer4(){

        String opc = "a";
        Deque<String> lista = new LinkedList<>();

        while (!opc.equals("X")) {
            System.out.println("--- LISTA DE COMPRA ---");
            System.out.println("1. Añadir Producto al Final");
            System.out.println("2. Eliminar el Primer Producto");
            System.out.println("3. Eliminar Producto por Nombre");
            System.out.println("4. Ver Primer Producto");
            System.out.println("5. Buscar Producto");
            System.out.println("6. Mostrar Lista Actual");
            System.out.println("X. Salir");
            System.out.println(" ");
            System.out.print("Elige una opción: ");
            opc = teclado.next();

            switch (opc) {
                case "1":
                    System.out.print("Producto a añadir: ");
                    lista.offerLast(teclado.next());
                    continue;
                case "2":
                    System.out.println(lista.pollFirst());
                    continue;
                case "3":
                    System.out.print("Producto a borrar: ");
                    lista.remove(teclado.next());
                    continue;
                case "4":
                    System.out.println(lista.peekFirst());
                    continue;
                case "5":
                    System.out.print("Que quieres buscar?: ");
                    if (!lista.contains(teclado.next())) {
                        System.out.println("ERROR. No exixste");
                        break;
                    } else {
                        System.out.println("En la lista!");
                        continue;
                    }
                case "6":
                    System.out.println(lista);
                    continue;
                case "X":
                    System.exit(1);
            }
        }

    }

    public static void ejer5(){
        System.out.print("Dime una palabra: ");
        String palabra = teclado.next();

        Deque<Character> letras = new LinkedList<>();
        for (int i = 0; i < palabra.length(); i++) {
            letras.offer(palabra.charAt(i));
        }

        while(letras.size()>1){
            if (letras.peekFirst()==letras.peekLast()){
                letras.pollFirst();
                letras.pollLast();
            }
        }

    }
}
