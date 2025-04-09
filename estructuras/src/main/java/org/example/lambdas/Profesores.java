package org.example.lambdas;

@FunctionalInterface
public interface Profesores {

    String calificar(int nota);

//    void modificar();
    //para utilizar esta clase como lambdas solo se puede tener en la interfaz 1 método.
}
