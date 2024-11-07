package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Sum(System.in);
    }

    public static void Sum(InputStream in) {
        Scanner scanner = new Scanner(new InputStreamReader(in)).useLocale(Locale.US);
        double sum = 0.0d;

        while (scanner.hasNext()){
            if(scanner.hasNextDouble()){
                sum += scanner.nextDouble();
            }
            else {
                scanner.next();
            }
        }

        System.out.printf(Locale.US,"%6f", sum);
    }
}
