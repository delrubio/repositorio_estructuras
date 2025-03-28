package org.example.comparadores;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Figuras> {

    //clase que solo se dedica a comparar. Hay que delararle el tipo de objeto que queremos.

    @Override
    public int compare(Figuras figura1, Figuras figura2) {

        int resultadoComprar = figura1.getNombre().compareTo(figura2.getNombre());

        if (resultadoComprar!=0){
            return resultadoComprar;
        }
        return figura1.getSuperficie().compareTo(figura2.getSuperficie());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
