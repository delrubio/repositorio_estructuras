package org.example.cosasJSON.Ejercicio2;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static final String apiUrl = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd,eur";
    public static Moneda moneda;

    public static void main(String[] args) {
        URL url;
        HttpURLConnection conexion;

        try {
            url = new URL(apiUrl);
            conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                json.append(line);
            }
            in.close();

            Gson gson = new Gson();
            moneda = gson.fromJson(json.toString(), Moneda.class);

            System.out.println("Ethereum: ");
            System.out.println("  Precio en USD: " + moneda.ethereum.getUsd() + "$");
            System.out.println("  Predio en EUR: " + moneda.ethereum.getEur() + "€");

            System.out.println("Bitcoin: ");
            System.out.println("  Precio en USD: " + moneda.bitcoin.getUsd() + "$");
            System.out.println("  Predio en EUR: " + moneda.ethereum.getEur() + "€");

        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

    }

}
