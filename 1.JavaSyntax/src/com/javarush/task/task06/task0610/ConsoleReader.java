package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader stringReader = new BufferedReader(new InputStreamReader(System.in));
        String readText = stringReader.readLine();
        return readText;

    }

    public static int readInt() throws Exception {
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      return number;

    }

    public static double readDouble() throws Exception {
      Scanner scanner = new Scanner(System.in);
      double number = scanner.nextDouble();
      return number;

    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean bool = scanner.nextBoolean();
        if (bool == true) {
        }
      return bool;
    }

    public static void main(String[] args) {

    }
}
