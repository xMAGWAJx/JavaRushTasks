package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      int d = scanner.nextInt();
      System.out.println(Math.max((Math.max(a, b)),(Math.max(c, d))));
    }
}
