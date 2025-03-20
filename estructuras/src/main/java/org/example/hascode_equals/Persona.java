package org.example.hascode_equals;

import lombok.Getter;

public class Persona {
    @Getter
    private int edad;

    public Persona(int edad){
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }
}
