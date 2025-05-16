package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarios {
    public Binarios() {
    }

    public static void main(String[] var0) {
        try {
            DataOutputStream var1 = new DataOutputStream(new FileOutputStream("C:\\Users\\1DAW\\Desktop\\repositorio_estructuras\\Ficheros\\src\\main\\resources\\fichero.bin"));
            var1.writeBoolean(true);
            var1.writeDouble(0.2);
            var1.writeInt(140);
            var1.writeUTF("Como estas");
            var1.close();
        } catch (IOException var8) {
            System.out.println("ERES UN CARA ALFALFA");
            var8.getMessage();
        }

        try {
            DataInputStream var10 = new DataInputStream(new FileInputStream("C:\\Users\\1DAW\\Desktop\\repositorio_estructuras\\Ficheros\\src\\main\\resources\\fichero.bin"));
            boolean var2 = var10.readBoolean();
            double var3 = var10.readDouble();
            int var5 = var10.readInt();
            String var6 = var10.readUTF();
            var10.close();
            System.out.println("Varibles: " + var2 + ", " + var3 + ", " + var5 + ", " + var6);
        } catch (IOException var7) {
            System.out.println("ERES UN CARA ALFALFA");
            var7.getMessage();
        }

        try {
            FileInputStream var11 = new FileInputStream("C:\\Users\\1DAW\\Desktop\\repositorio_estructuras\\Ficheros\\src\\main\\resources\\fichero.bin");

            int var12;
            while((var12 = var11.read()) != -1) {
                System.out.print((char)var12);
            }
        } catch (IOException var9) {
            System.out.println("ESTO NO SE PORQUE NO FUNCIONA");
            var9.printStackTrace();
        }

    }
}