package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      int m = scanner.nextInt();
      int n = scanner.nextInt();

      for (int a = 1; a <= m; a++) {
        System.out.print(8);
        for (int b = 1; b <n; b++){
          System.out.print(8);
        }
        System.out.println();
      }
    }
}
