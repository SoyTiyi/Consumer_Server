package edu.escuelaing.arep.app.Cliente;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Llamado al servidor fachada o consumidor \n");
            System.out.println("Con url https://enigmatic-earth-07531.herokuapp.com \n");
            System.out.println(makeHTTPGet("https://enigmatic-earth-07531.herokuapp.com/fachada?value=15&opera=sin"));
            System.out.println("\n");
            System.out.println("Llamado al servidor que se encarga de clacular \n");
            System.out.println("Con url https://agile-fjord-35238.herokuapp.com\n");
            System.out.println(makeHTTPGet("https://agile-fjord-35238.herokuapp.com/fachada?value=15&opera=sin"));
            System.out.println("");
            System.out.println("Valores que se enviaron\n");
            System.out.println("value = 15 y opera = sin");
        } catch (Exception e) {
            System.out.println("F");
            throw new Exception("Exception PA!");
        }

    }

    public static String makeHTTPGet(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }
}
