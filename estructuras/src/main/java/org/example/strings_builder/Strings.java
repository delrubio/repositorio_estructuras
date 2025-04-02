package org.example.strings_builder;

public class Strings {
    public static void main(String[] args) {

        StringBuilder texto = new StringBuilder("Hola ");
        texto.append("Mundo");
        texto.append(" soy David");

        texto.insert(0, "He nacido, ");

        texto.replace(26, 31, "Miguel");

        texto.delete(16, 22);

        texto.reverse();

        System.out.println(texto);


    }
}
