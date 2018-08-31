package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    for (int b = 0; b != -1; b++) {
      int a = scanner.nextInt();
      sum += a;
      if (a == -1)
        break;
    }
    System.out.println(sum);
  }
}
