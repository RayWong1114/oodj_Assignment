package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Csvreader {
    public static void main(String[] args) {
        String Filename = "src/course_assessment_information.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(Filename))) {
            System.out.println("Its here");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}