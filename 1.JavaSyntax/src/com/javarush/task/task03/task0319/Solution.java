package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
      System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

    }
}
