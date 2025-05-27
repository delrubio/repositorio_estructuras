package org.example.cosasJSON.Ejercicio1;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Videojuego {

    private static final String[] PLATAFORMAS = {"PS5", "PC", "Xbox"};
    private static final String[] GENEROS = {"accion", "estrategia", "conduccion"};
    private String nombre;
    private String plataforma;
    private double precio;
    private boolean disponible;
    private String genero;

    public Videojuego(String nombre, String plataforma, double precio, boolean disp, String genero){
        this.nombre = nombre;
        this.plataforma = comprobarPlataforma(plataforma);
        this.precio = precio;
        this.disponible = disp;
        this.genero = comprobarGenero(genero);
    }

    public String comprobarPlataforma(String plat){
        String comprobado = "null";
        for(String opc : PLATAFORMAS){
            if (opc.matches(plat)){
                comprobado = plat;
                break;
            }
        }

        if (comprobado.equals(null)){
            System.out.println("No está esta plataforma disponible.");
        }
        return comprobado;
    }

    public String comprobarGenero(String genero){
        String comprobado = "null";
        for(String opc : GENEROS){
            if (opc.matches(genero)){
                comprobado = genero;
                break;
            }
        }

        if (comprobado.equals(null)){
            System.out.println("No existe este género.");
        }
        return comprobado;
    }
}
