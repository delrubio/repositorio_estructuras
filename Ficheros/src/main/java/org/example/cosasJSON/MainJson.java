package org.example.cosasJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MainJson {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Bicicletas bici = new Bicicletas("ORBEA", "RALLON", 1000, Arrays.asList("David", "Mario", "Ivan"));

        String json = gson.toJson(bici);
        System.out.println(json);

        try (FileWriter archivo = new FileWriter("src/main/java/org/example/cosasJSON/bicicletas.json")){
            gson.toJson(json, archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bicicletas bici2 = gson.fromJson(json, Bicicletas.class);
        System.out.println(bici2.getMarca());

        try {
            FileReader reader = new FileReader("src/main/java/org/example/cosasJSON/bicicletas.json");
            Bicicletas bici3 = gson.fromJson(reader, Bicicletas.class);
            System.out.println(bici3.getMarca());
            //convertir a objeto en bici 3 el contenido de bicicletas.json, con la libreria gson, lo cogemos el objeto_leido
            // que es el archivo con el contenido y le damos el formato del objeto. Se coje la clase del objeto no el objeto.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Bicicletas> bicicletasList = new ArrayList<>();
        bicicletasList.add(new Bicicletas("TREK", "SLASH", 1450, Arrays.asList("Cesar", "Mauro", "Patri")));
        bicicletasList.add(new Bicicletas("CANYON", "NERVE", 1876, Arrays.asList("Pedro", "Denys", "Paco")));

        String jsonList = gson.toJson(bicicletasList);
        System.out.println(jsonList);

    }
}