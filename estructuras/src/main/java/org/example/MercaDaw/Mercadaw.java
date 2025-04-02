package org.example.MercaDaw;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Mercadaw {

    List<Cliente> clienteList;

    public void generarClientes(){

        clienteList=new LinkedList<>();
        Cliente cliente = new Cliente("prueba", "Prueba123");
        clienteList.add(cliente);

    }

     public List<Cliente> getClienteList(){
        return Collections.unmodifiableList(clienteList);
     }

}
