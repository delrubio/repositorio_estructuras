package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Estudiante {

    @Override
    public String toString() {
        return "Estudiante{" +
                "nia=" + nia +
                ", nombre='" + nombre + '\'' +
                ", date=" + date +
                '}';
    }

    private int nia;
    private String nombre;
    private LocalDate date;

}
