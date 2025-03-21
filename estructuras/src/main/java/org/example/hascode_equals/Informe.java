package org.example.hascode_equals;

import java.util.Objects;
import java.util.Stack;

public class Informe{

    private int codigo;
    private Tipo tipo;

    public static Stack<Informe> pilaInformes = new Stack<>();

    public Informe(int codigo, String tarea){
        this.codigo=codigo;
        this.tipo=comprobarTarea(tarea);
        if (tipo.equals(Tipo.ERROR)){
            System.out.println("ERROR. Tipo no válido...");
        }else {
            pilaInformes.push(this);
        }
    }

    public Tipo comprobarTarea(String tarea){

        tipo=Tipo.valueOf(tarea);

        for (int i = 0; i < 3; i++) {
            tipo=tipo.siguiente(tarea);
        }

        return tipo;

    }

    public void contarTareas(){
        for (Informe informe : pilaInformes){
            System.out.println(" ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }

    @Override
    public String toString() {
        return "Informe: " + "Código " + codigo + ", tipo " + tipo + ".";
    }
}
