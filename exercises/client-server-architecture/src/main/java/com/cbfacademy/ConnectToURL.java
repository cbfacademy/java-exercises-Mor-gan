package com.cbfacademy;

import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URLConnection;

public class ConnectToURL {

    public static void main(String[] args) throws Exception {
        try {
            URL myURL = new URL("https://codingblackfemales.com/");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(myURLConnection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }

        catch (MalformedURLException e) {
            // new URLO failed
            System.out.println(e.getMessage());
        } catch (IOException e) {
            // openConnection() failed
            System.out.println(e.getMessage());
        };
    }
}
