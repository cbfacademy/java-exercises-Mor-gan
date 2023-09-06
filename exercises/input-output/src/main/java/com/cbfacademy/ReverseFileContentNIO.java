package com.cbfacademy;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ReverseFileContentNIO {
    public static void main(String[] args) {
        Path inputFilePath = Paths.get("C:\\cbfacademy\\java-exercises-Mor-gan\\exercises\\input-output\\src\\main\\resources\\exercise.txt"); // Provide the correct file path
        Path outputFilePath = Paths.get("C:\\cbfacademy\\java-exercises-Mor-gan\\exercises\\input-output\\src\\main\\resources\\Inverted.txt"); // Provide the correct file path

        try {
            List<String> lines = Files.readAllLines(inputFilePath);
            
            // lines.reverse();

            Files.write(outputFilePath, lines);

            System.out.println("Content has been successfully inverted and written to 'inverted.txt'.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
