package org.example.pilas;

import java.util.Scanner;
import java.util.Stack;

public class ejercicios_simples {

    static Scanner teclado = new Scanner(System.in);

    public static void ejercicio1(){
        Stack<Character> letras = new Stack<>();

        letras.push('A');
        letras.push('B');
        letras.push('C');
        letras.push('D');
        letras.push('E');

        if (letras.isEmpty()){
            System.out.println("VACÍA");
        }else{
            System.out.println("Hay " + letras.size() + " elementos");
        }

        letras.peek();

        while (!letras.isEmpty()){
            System.out.println(letras.pop());
        }
    }

    public static void ejercicio2(){

        Stack<Integer> inverso = new Stack<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Dime un numero: ");
            inverso.push(teclado.nextInt());
        }

        System.out.println("NUMERO INVERTIDO: ");

        while(!inverso.isEmpty()){
            System.out.println(inverso.pop());
        }
    }

    public static void ejercicio3(){
        System.out.print("Expresión: ");
        String expresion = teclado.next();

        if (esBalanceado(expresion)){
            System.out.println("BIEN");
        }else {
            System.out.println("MAL");
        }

    }

    public static boolean esBalanceado(String expre){

        Stack<Character> cadena = new Stack<>();

        for (int i = 0; i < expre.length(); i++) {
            if (expre.charAt(i)==')' && cadena.contains('(')){
                cadena.pop();
            } else if (expre.charAt(i)=='(' || expre.charAt(i)==')' && !cadena.contains('(')) {
                cadena.push(expre.charAt(i));
            }
        }

        if (cadena.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
