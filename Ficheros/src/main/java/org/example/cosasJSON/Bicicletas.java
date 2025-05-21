package org.example.cosasJSON;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class Bicicletas {

    private String marca;
    private String modelo;
    private double precio;
    private List<String> corredores;

    public Bicicletas(String marca, String modelo, double precio, List<String> corredores){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        corredores = new ArrayList<>();
    }

    public Bicicletas(){

    }
}
