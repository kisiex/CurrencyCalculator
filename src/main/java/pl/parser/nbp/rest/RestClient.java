package pl.parser.nbp.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class RestClient {

    private static final String REST_URI = "www.nbp.pl";

    public static InputStream getInputStream(String name) throws IOException {
        String file = String.format("/kursy/xml/%s.xml", name);
        return new URL("https", REST_URI, file).openStream();
    }

    public static List<String> getFile(String path) throws IOException {
        ArrayList<String> result = new ArrayList<>();

        URL url = new URL("https://" + REST_URI + "/kursy/xml/" + path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        while ((output = br.readLine()) != null) {
            result.add(output);
        }
        conn.disconnect();

        return result;
    }
}
