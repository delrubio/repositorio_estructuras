package org.example.MercaDaw;

public enum Producto {

    MANZANAS(2.30), PAN(1.00), ARROZ(3.50), POLLO(4.30), LECHE(1.30), ACEITE(8.30), HUEVOS(3.30), TOMATES(4.00), PASTA(0.89);

    private double precio;

    Producto(double precio){
        this.precio=precio;
    }

    public double getPrecio(){
        return precio;
    }


    public Producto siguiente(Producto estado){

        switch (estado){
            case MANZANAS:
                return Producto.PAN;
            case PAN:
                return Producto.ARROZ;
            case ARROZ:
                return Producto.POLLO;
            case POLLO:
                return Producto.LECHE;
            case LECHE:
                return Producto.ACEITE;
            case ACEITE:
                return Producto.HUEVOS;
            case HUEVOS:
                return Producto.TOMATES;
            case TOMATES:
                return Producto.PASTA;
            case PASTA:
                return Producto.MANZANAS;
            default:
                return Producto.MANZANAS;
        }

    }
}
