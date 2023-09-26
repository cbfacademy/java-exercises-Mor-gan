package com.cbfacademy;

import java.io.*;
import java.net.*;

public class ExerciseClient {
 public static void main(String[] args) {
    try (Socket Socket = new Socket("localhost", 4040);
            PrintWriter out = new PrintWriter(Socket.getOutputStream(), true)){
                String message = "Hello message";
                out.println(message);
                System.out.println("Sent message to serverß:" + message); 
    }catch (IOException e){
        e.printStackTrace();
    }
}
}
