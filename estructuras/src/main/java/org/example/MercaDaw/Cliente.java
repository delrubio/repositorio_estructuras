package org.example.MercaDaw;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cliente {

    static Set<Cliente> clienteList = new HashSet<>();

    //atributos de cliente
    private String usuario;
    private String pass;
    private String direccion;
    private Pedido pedido;
    private boolean promos;

    public Cliente(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
        promos=false;
        this.direccion = "Calle falsa, 123";
        clienteList.add(this);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isPromos(){
        return promos;
    }

    public void setPromos() {
        promos = true;
    }

    //creo un nuevo pedido, conmigo mismo en la clase Pedido
    public void crearPedido() {
        pedido = new Pedido(this);
    }

    //en la lista de productos de la clase Pedido, le pongo el producto que me de el swich de AppZonaClientes.
    public void insertarProducto(Producto producto) {
        pedido.listaPedido(producto);
    }

    //cogemos el importe actual del pedido que lleva el cliente.
    public double importePedido(String prod) {
        return pedido.importeTotal;
    }

    //conectamos que el cliente al no querer seguir añadiendo productos, lo enviamos a Pedido para ir cerrando.
    public void fin(){
        pedido.resumenCompra();
    }

    //tenemos que mirar que no hayan 2 cliente con el mismo usuario.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(usuario);
    }
}
