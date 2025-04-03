package org.example.MercaDaw;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

    static Set<Cliente> clienteList = new HashSet<>();

    @Getter
    private String usuario;
    @Getter
    private String pass;
    private String direccion;
    public double importeTotal;

    private Pedido pedido;

    public Cliente(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
        direccion = "Calle falsa, 123";
    }

    public void cerarPedido() {
    }

    public void insertarProducto(Producto producto) {

    }

    public double importePedido(String prod) {

        Producto producto = Producto.MANZANAS;

        for (int i = 0; i < 10; i++) {
            producto = producto.siguiente(producto);

            if (prod.matches(producto.name())) {
                importeTotal += producto.getPrecio();
            }
        }

        return importeTotal;
    }

}
