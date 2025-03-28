package org.example.Programame;

public class Programame {
    static java.util.Scanner in;

    public static void casoDePrueba() {

        String pass = in.next();

        String[] letras = pass.split("");

        int M = 0;
        int m = 0;
        int n = 0;
        int s = 0;

        for (int i = 0; i < letras.length; i++) {
            if(letras[i].matches("[A-Z]+")){
                M++;
            }

            if (letras[i].matches("[a-z]+")){
                m++;
            }

            if (letras[i].matches("[1-9]+")){
                n++;
            }

            if (letras[i].matches("[+_)(*&^%$#@!./,;{}]+")){
                s++;
            }
        }

        if (M >= 1 && m >= 1 && n>=1 && s >= 1 ) {
            if (letras.length <= 30 && letras.length >= 12){
                System.out.println("OK");
            }else {
                System.out.println("ERROR");
            }
        }else {
            System.out.println("ERROR");
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();

        if (numCasos < 1 && numCasos >1000){
            System.exit(1);
        }else{
            for (int i = 0; i < numCasos; i++)
                casoDePrueba();
        }
    } // main
}