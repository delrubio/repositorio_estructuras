package org.example.MercaDaw;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AppZonaClientes {

    static String usu;
    static String pass;

    static List<Cliente> clienteList = new LinkedList<>();
    static Scanner teclado = new Scanner(System.in);
    static Cliente clienteStatic;

    public static void main(String[] args) {

        Mercadaw mercadaw = new Mercadaw();
        mercadaw.generarClientes();

        clienteList=mercadaw.getClienteList();
        autenticacion(clienteList);

    }

    static public void autenticacion(List<Cliente> cliente){
        for (Cliente client : cliente){

            for (int i = 0; i < 3; i++) {

                System.out.print("Usuario (" + client.getUsuario() + "): " );
                usu = teclado.next();
                System.out.print("Contraseña (" + client.getPass() + "): " );
                pass = teclado.next();

                if(usu.matches(client.getUsuario()) && pass.matches(client.getPass())){
                    clienteStatic=client;
                    iniciarCompra();
                    break;
                }else{
                    if (i == 2){
                        System.out.println("ERROR DE AUTENTICACIÓN.");
                        break;
                    }else {
                        System.out.println("Vaya... Algo no coincide o no existe. Vuelve a intentarlo!");
                    }
                }

            }

        }
    }

    static public void iniciarCompra(){
        System.out.println("¡BIENVENIDO! Añade productos a tu cesta: ");
        clienteStatic.cerarPedido();
        imprimirProducto();

    }

    static public void imprimirProducto(){
        Producto producto = Producto.MANZANAS;

        for (int i = 0; i < 10; i++) {
            System.out.println("PRODUCTO - " + producto + ", " + producto.getPrecio() + "€");
            producto=producto.siguiente(producto);
        }

        System.out.print("Elige un producto: ");
        String opc = teclado.next().toUpperCase();

        switch (opc){
            case "MANZANAS":
                clienteStatic.insertarProducto("MANZANAS");
            case "PAN":
                clienteStatic.insertarProducto("PAN");
            case "ARROZ":
                clienteStatic.insertarProducto("ARROZ");
            case "POLLO":
                clienteStatic.insertarProducto("POLLO");
            case "LECHE":
                clienteStatic.insertarProducto("LECHE");
            case "ACEITE":
                clienteStatic.insertarProducto("ACEITE");
            case "HUEVOS":
                clienteStatic.insertarProducto("HUEVOS");
            case "TOMATES":
                clienteStatic.insertarProducto("TOMATES");
            case "PASTA":
                clienteStatic.insertarProducto("PASTA");
            default:
                System.out.println("¡VAYA! El producto indicado no existe. Prueba de nuevo...");
                imprimirProducto();

            System.out.println("¿Quieres continuar con la compra? [s/n]");
            opc=teclado.next().toLowerCase();

            if (opc.matches("si")){
                    imprimirProducto();
            }else {
                imprimirDespedida();
            }
        }
    }

    static public void imprimirDespedida(){

    }

}
