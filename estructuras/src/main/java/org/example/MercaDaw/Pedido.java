package org.example.MercaDaw;

import java.util.*;

public class Pedido {

    HashMap<Producto, Integer> pedido = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);

    public double importeTotal;
    private Cliente cliente;
    static String opc;

    public Pedido(Cliente cliente){
        this.cliente=cliente;
    }

    //este metodo, añade productos a la lista de pedido y cuenta la cantidad de productos que hay en ella. Gracias al
    // getOrDefault, si no existe, la creamos, y si existe, le sumamos 1 unidad a ese producto concreto.
    public void listaPedido(Producto producto){
        pedido.put(Producto.valueOf(producto.name()), pedido.getOrDefault(Producto.valueOf(producto.name()), 0)+1);
        importeTotal+=producto.getPrecio();
    }

    //cuando en AppZonaClientes el usuario quiere salir de la cesta, a través de Cliente fin(), venimos aquí.
    public void resumenCompra(){
        System.out.println("--------------------------------");
        System.out.println("Resumen de tu Carro de la Compra");
        System.out.println("--------------------------------");
        System.out.println("Preductos: ");

        //con el entry map, podemos ir cogiendo el producto según su nombre y su cantidad para mostrarle al usuario
        // el carrito de la compra completo con cada unidad de producto y su precio.
        for (Map.Entry<Producto, Integer> mapa : pedido.entrySet()){
            System.out.println(mapa.getValue() + " " + mapa.getKey() + " " + mapa.getKey().getPrecio() + "€");
        }

        System.out.println("IMPORTE TOTAL: " + importeTotal + "€");

        System.out.println("--------------------------------");
        System.out.println("¿Que deseas hacer?");
        System.out.println("1. Aplicar Promoción");
        System.out.println("2. Mostrar resumen ordenado");
        System.out.println("3. Terminar pedido");
        System.out.println("--------------------------------");
        System.out.println("Elige una opción: ");
        opc=teclado.next();

        switch (opc){
            case "1"://comprobamos que el cliente no haya obtenido ya una promoción en la compra.
                if (cliente.isPromos()){
                    System.out.println("VAYA! Parece que los descuentos ya se han aplicado pillín...");
                    resumenCompra();
                }else {
                    aplicarPromo3x2();
                    //si el cliente ahún no ha obtenido descuento, se lo hacemos.
                }
                break;
            case "2"://para poder ordenar el mapa de los productos. Hacemos un Map.Entry y utilizamos la funcion .sort
                // que implementa el Comparators, y lo queremos ordenar en orden reverso
                ArrayList<Map.Entry<Producto, Integer>> listaMapa = new ArrayList<>(pedido.entrySet());
                listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

                //y con el for, cogemos la listaMapa que es la que hemos ordenado anteriormente y la mostramos en orden.
                for (Map.Entry<Producto, Integer> mapa : listaMapa){
                    System.out.println(mapa.getValue() + " " + mapa.getKey() + " " + mapa.getKey().getPrecio() + "€");
                }
                resumenCompra();
            case "3"://bye bye butterfly
                AppZonaClientes.imprimirDespedida();
                break;

            default:
                System.out.println("¡VAYA! Coge una opción válida.");
                resumenCompra();
        }

    }

    public void aplicarPromo3x2(){

        System.out.println("--------------------------------");
        System.out.println("-  APLICANDO PROMOCIÓN DEL 3x2  ");
        System.out.println("--------------------------------");

        //gracias al Map.Entry, cogemos los productos con sus unidades y comparamos lo siguiente...
        for (Map.Entry<Producto, Integer> mapaPromos : pedido.entrySet()){
            if (mapaPromos.getValue() > 2){ //si es mayor a 2, minimo hay una unidad descontar
                int cont = mapaPromos.getValue() /3;
                //como hay a descontar 100% una unidad, sacamos el resto de una división entre 3 porque aproxima a el
                // valor con un int, y esas son las unidades a descontar.
                // Si hay 4,1 si hay 7,2 si hay 3,1 si hay 9,3 si hay 8,2

                double precioTotal = (mapaPromos.getKey().getPrecio() * cont);
                //ahora multiplicamos el valor del producto por las unidades restantes que hemos quitado

                importeTotal -= precioTotal;
                //y a el importe total, le restamos el valor que tenian las unidades que hemos quitado.
                // Si quitamos 2 panes, pues restamos 2€ y así con todos

                //¡OJO! NO CAMBIO LAS UNIDADES DEL PEDIDO PORQUE EL CLIENTE COMPRA LO QUE QUIERA, OTRA COSA ES LO QUE SE LE COBRE.
            }
        }

        System.out.println("- DESCUENTO DE 3x2: " + importeTotal + "€");
        //mostramos el resultado del resto de la compra con el descuento del 3x2

        aplicarPromo10();
        //aplicamos el 10%

        resumenCompra();
        //por si queremos hacer algo

    }

    public void aplicarPromo10(){
        cliente.setPromos();
        importeTotal=importeTotal*0.90;
        System.out.println("- DESCUENTO DEL 10%: " + importeTotal + "€");
    }

}
