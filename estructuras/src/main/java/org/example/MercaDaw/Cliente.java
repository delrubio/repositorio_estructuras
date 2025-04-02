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

    private Pedido pedido;

    public Cliente(String usuario, String pass){
        this.usuario=usuario;
        this.pass=pass;
        direccion="Calle falsa, 123";
    }

    public void cerarPedido(){
    }

    public void insertarProducto(String producto){

    }

    public double importePedido(){
        return 0;
    }

}
