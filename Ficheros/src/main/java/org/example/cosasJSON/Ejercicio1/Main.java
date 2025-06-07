package org.example.cosasJSON.Ejercicio1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.cosasJSON.Bicicletas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner teclado = new Scanner(System.in);
    public static ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();
    public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static final double PRECIO = 30;

    public static void main(String[] args) {

        System.out.print("¿Quantos videojuegos quieres crear? : ");
        int num = teclado.nextInt();
        nuevoVideojuego(num);//crear 3 videojuegos
        gsonVideojuegos();//guardarlos en el json
        leerJson();//leer el json
        cambiarLista();//cambiar la lista con el contenido del json
        anyadirVideojuego();//añadir un videojuego
        videoJuegosPrecio();//precio mnenor a variable global (30)
        gsonVideojuegos();//actiualizar la lista json

    }

    public static void nuevoVideojuego(int num){

        for (int i = 0; i < num; i++) {
            System.out.println("Nombre del Videojuego");
            String nombre = teclado.next();
            System.out.println("Nombre de la Plataforma");
            String plat = teclado.next();
            System.out.println("Precio del Videojuego");
            double precio = teclado.nextDouble();
            System.out.println("Disponibilidad (true/flase)");
            boolean bool = teclado.nextBoolean();
            System.out.println("Genero del Videojuego");
            String genero = teclado.next();

            Videojuego videojuego = new Videojuego(nombre, plat, precio, bool, genero);
            listaVideojuegos.add(videojuego);

        }

    }

    public static void gsonVideojuegos(){

        for (Videojuego videojuego : listaVideojuegos){

            String json = gson.toJson(videojuego);

            try (FileWriter archivo = new FileWriter("src/main/java/org/example/cosasJSON/Ejercicio1/videojuegos.json")){
                gson.toJson(json, archivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void leerJson(){

        try {
            FileReader reader = new FileReader("src/main/java/org/example/cosasJSON/Ejercicio1/videojuegos.json");
            Videojuego videojuego = gson.fromJson(reader, Videojuego.class);
            System.out.println("Videojuego: " + videojuego.getNombre() + ", " + videojuego.getPrecio() + "€");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Videojuego> cambiarLista(){
        try {
            FileReader reader = new FileReader("src/main/java/org/example/cosasJSON/Ejercicio1/videojuegos.json");
            Videojuego videojuego = gson.fromJson(reader, Videojuego.class);
            if (!listaVideojuegos.isEmpty()){
                listaVideojuegos.clear();
            }
            listaVideojuegos.add(videojuego);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listaVideojuegos;
    }

    public static ArrayList<Videojuego> anyadirVideojuego(){
        System.out.println("Nombre del Videojuego");
        String nombre = teclado.next();
        System.out.println("Nombre de la Plataforma");
        String plat = teclado.next();
        System.out.println("Precio del Videojuego");
        double precio = teclado.nextDouble();
        System.out.println("Disponibilidad (true/flase)");
        boolean bool = teclado.nextBoolean();
        System.out.println("Genero del Videojuego");
        String genero = teclado.next();

        Videojuego videojuego = new Videojuego(nombre, plat, precio, bool, genero);
        listaVideojuegos.add(videojuego);
        return listaVideojuegos;
    }

    public static void videoJuegosPrecio(){
        for (Videojuego videojuego : listaVideojuegos){
            if (videojuego.getPrecio() < PRECIO){
                System.out.println("Videojuego: " + videojuego.getNombre() + ", " + videojuego.getPrecio() + "€");
            }
        }
    }
}
