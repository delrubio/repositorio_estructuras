package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Dime el 'PATH' del primer fichero que quieres combinar: ");
            String fich1 = teclado.next();
            System.out.print("Dime el 'PATH' del segundo fichero que quieres combinar: ");
            String fich2 = teclado.next();


            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/tmp/combinado.txt"));
            BufferedReader reader1 = new BufferedReader(new FileReader(fich1));
            BufferedReader reader2 = new BufferedReader(new FileReader(fich2));

            ArrayList<String> pal1List = new ArrayList<>();
            String linea;
            while((linea = reader1.readLine()) != null){
                String[] tmp = linea.split(" ");

                for (String tmp_pal : tmp){
                    pal1List.add(tmp_pal);
                }
            }

            ArrayList<String> pal2List = new ArrayList<>();
            while((linea = reader2.readLine()) != null){
                String[] tmp = linea.split(" ");

                for (String tmp_pal : tmp){
                    pal2List.add(tmp_pal);
                }
            }

            Iterator<String> iterator1 = pal1List.iterator();
            Iterator<String> iterator2 = pal2List.iterator();

            while (iterator1.hasNext() || iterator2.hasNext()){

                if (iterator1.hasNext()){
                    writer.write(iterator1.next());
                    writer.write(" ");
                    iterator1.remove();
                }

                if (iterator2.hasNext()){
                    writer.write(iterator2.next());
                    writer.write(" ");
                    iterator2.remove();
                }

            }

            writer.close();

        } catch (IOException e) {
            e.getMessage();
        }

    }

}
