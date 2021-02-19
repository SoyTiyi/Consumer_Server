package edu.escuelaing.arep.app.Spark;

import static spark.Spark.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        get("/fachada", (req, res) -> {
            int value = Integer.parseInt(req.queryParams("value"));
            String opera = req.queryParams("opera");
            String url = "https://agile-fjord-35238.herokuapp.com/fachada?value="+value+"&opera="+opera;
            return makeHTTPGet(url);
        });
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

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}