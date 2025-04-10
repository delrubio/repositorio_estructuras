package org.example.lambdas.lambdaObjeto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Profesor profe1 = new Profesor("Paco", "DAM", 42);
//        Profesor profe2 = new Profesor("Ivan", "DAW", 23);
//
//        VerificarVotoProfe voto = (profesor) ->{
//
//            System.out.println("Verificando voto para " + profesor.getNombre());
//
//            if (profesor.getEdad()>=18){
//                return true;
//            }else{
//                return false;
//            }
//
//        };
//
//        System.out.println(voto.pudesVotar(profe1));
//        System.out.println(voto.pudesVotar(profe2));


        List<Producto> productoList = new ArrayList<>();

        productoList.add(new Producto("Smartphone", 149.99, "Electronica"));
        productoList.add(new Producto("Tablet", 72.00, "Electronica"));
        productoList.add(new Producto("Perfume árabe", 40.87, "Perfume"));
        productoList.add(new Producto("Kebab Durum", 3.98, "Alimentaciòn"));


        FiltroProducto lambda = (producto) -> {

            if(producto.getCategoria().equals("Electronica") && producto.getPrecio() > 100){
                return true;
            }
            return false;
        };

        for (Producto producto : productoList){
            if (lambda.filtrar(producto)){
                System.out.println(producto);
            }
        }


    }

}
