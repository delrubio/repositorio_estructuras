package org.example.inmutabilidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arbitro {

    List<String> listaArbi = new ArrayList<>(Arrays.asList("Gil Manzano", "Negreira", "Clos Gómez"));


    //todo le que utilize este metodo no lo va a poder modificar la lista.
    public List<String> getListaArbi(){
        return Collections.unmodifiableList(listaArbi);
    }

    @Override
    public String toString() {
        return "Arbitro{" +
                "listaArbi=" + listaArbi +
                '}';
    }

}
