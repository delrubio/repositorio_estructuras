package org.example.MercaDaw;

import java.util.HashMap;

public class Pedido {

    HashMap<Producto, Integer> pedido = new HashMap<>();
    private double pimporteTotal;

    public void listaPedido(Producto producto){
        pedido.put(Producto.valueOf(producto.name()), pedido.getOrDefault(Producto.valueOf(producto.name()), 1)+1);
    }

    public void aplicarPromo3x2(){

    }

    public void aplicarPromo10(){

    }
}
