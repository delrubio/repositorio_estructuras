package org.example.lambdas;

@FunctionalInterface
public interface VerificarVoto {
    boolean puedesVotar(String nombre, int edad);
}
