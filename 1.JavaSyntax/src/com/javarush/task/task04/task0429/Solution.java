package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      int countPositive = 0;
      int countNegative = 0;

      if (a > 0) countPositive++;
      if (b > 0) countPositive++;
      if (c > 0) countPositive++;

      if (a < 0) countNegative++;
      if (b < 0) countNegative++;
      if (c < 0) countNegative++;

      System.out.println("количество отрицательных чисел: " + countNegative);
      System.out.println("количество положительных чисел: " + countPositive);

    }
}
