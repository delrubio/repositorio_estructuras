package org.example.MercaDaw;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AppZonaClientes {

    static String usu;
    static String pass;
    static String opc;

    static List<Cliente> clienteList = new LinkedList<>();
    static Scanner teclado = new Scanner(System.in);
    static Cliente clienteStatic;

    public static void main(String[] args) {

        //creamos un nuevo cliente llamando a Mercadaw
        Mercadaw mercadaw = new Mercadaw();
        mercadaw.generarClientes();

        //cogemos la lista de clientes y autenticamos el LoggIn
        clienteList=mercadaw.getClienteList();
        autenticacion(clienteList);

    }

    static public void autenticacion(List<Cliente> cliente){
        for (Cliente client : cliente){
            for (int i = 0; i < 3; i++) {

                System.out.print("Usuario (" + client.getUsuario() + "): " );//muestro y cojo el usuario.
                usu = teclado.next();
                System.out.print("Contraseña (" + client.getPass() + "): " );//muestro y cojo la pass
                pass = teclado.next();

                if(usu.matches(client.getUsuario()) && pass.matches(client.getPass())){//si el usuario y la pass coinciden empezamos
                    clienteStatic=client;//nos quedamos con el cliente que ha iniciado sesión
                    iniciarCompra();//iniciamos
                    break;
                }else{
                    if (i == 2){
                        System.out.println("ERROR DE AUTENTICACIÓN.");//número de intentos
                        break;
                    }else {
                        System.out.println("Vaya... Algo no coincide o no existe. Vuelve a intentarlo!");//volver a intentar
                    }
                }

            }

        }
    }

    static public void iniciarCompra(){
        System.out.println("¡BIENVENIDO! Añade productos a tu cesta: ");
        clienteStatic.crearPedido();//creamos un pedido para el cliente
        imprimirProducto();//imprimimos los productos

    }

    static public void imprimirProducto(){
        Producto producto = Producto.MANZANAS;

        for (int i = 0; i < 10; i++) {
            System.out.println("PRODUCTO - " + producto + ", " + producto.getPrecio() + "€");
            producto=producto.siguiente(producto);//he utilizado la técnica del semaforo
        }

        System.out.print("Elige un producto: ");
        opc = teclado.next().toUpperCase();

        //con el swich, lo que hacemos es mostrar que se ha añadido a la cesta el producto y al cliente le añadimos
        // el producto en su clase llamando a insertarProducto()
        switch (opc) {
            case "MANZANAS":
                clienteStatic.insertarProducto(Producto.MANZANAS);
                System.out.println("Manzanas añadidas con con un importe de " + Producto.MANZANAS.getPrecio() + "€.");
                break;
            case "PAN":
                clienteStatic.insertarProducto(Producto.PAN);
                System.out.println("Pan añadido con con un importe de " + Producto.PAN.getPrecio() + "€.");
                break;
            case "ARROZ":
                clienteStatic.insertarProducto(Producto.ARROZ);
                System.out.println("Arroz añadido con con un importe de " + Producto.ARROZ.getPrecio() + "€.");
                break;
            case "POLLO":
                clienteStatic.insertarProducto(Producto.POLLO);
                System.out.println("Pollo añadido con con un importe de " + Producto.POLLO.getPrecio() + "€.");
                break;
            case "LECHE":
                clienteStatic.insertarProducto(Producto.LECHE);
                System.out.println("Leche añadida con con un importe de " + Producto.LECHE.getPrecio() + "€.");
                break;
            case "ACEITE":
                clienteStatic.insertarProducto(Producto.ACEITE);
                System.out.println("Aceite añadido con con un importe de " + Producto.ACEITE.getPrecio() + "€.");
                break;
            case "HUEVOS":
                clienteStatic.insertarProducto(Producto.HUEVOS);
                System.out.println("Huevos añadidos con con un importe de " + Producto.HUEVOS.getPrecio() + "€");
                break;
            case "TOMATES":
                clienteStatic.insertarProducto(Producto.TOMATES);
                System.out.println("Tomates añadidos con con un importe de " + Producto.TOMATES.getPrecio() + "€");
                break;
            case "PASTA":
                clienteStatic.insertarProducto(Producto.PASTA);
                System.out.println("Pasta añadida con con un importe de " + Producto.PASTA.getPrecio() + "€");
                break;
            default:
                System.out.println("¡VAYA! El producto indicado no existe. Prueba de nuevo...");
                imprimirProducto();
        }

        System.out.println("Importe Total");
        System.out.println("-------------");
        System.out.println(clienteStatic.importePedido(opc) + "€"); //Mostramos el importe actual que lleva

        System.out.println("¿Quieres continuar con la compra? [s/n]"); //Pregunto si quiere seguir o ir finalizando
        opc=teclado.next().toLowerCase();

        if (opc.matches("s")){ //Si quiere seguir vuelvo a imprimir y ha dejarle añadir cosas a la cesta
            imprimirProducto();
        }else if (opc.matches("n")) {
            clienteStatic.fin(); //Si no, procedemos a ir cerrando la compra
        }else {
            System.out.println("¡ERROR! Opción no válida");
        }
    }

    static public void imprimirDespedida(){
        System.out.println("¡GRACIAS POR SU PEDIDO!");
        System.out.println("Se lo enviarémos a " + clienteStatic.getDireccion()); //Mensage de despedida de donde le
                                                                                // llegará la compra
    }

}