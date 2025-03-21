package org.example.hascode_equals;

public class Ejercicio3 {

    public static void main(String[] args) {

        Informe informe1 = new Informe(1234, "ADMINISTRATIVO");
        Informe informe2 = new Informe(741, "PERSONAL");
        Informe informe3 = new Informe(2, "EMPRESARIAL");
        Informe informe4 = new Informe(39, "PERSONAL");
        Informe informe5 = new Informe(2, "EMPRESARIAL");


        System.out.println(Informe.pilaInformes);
    }

}
