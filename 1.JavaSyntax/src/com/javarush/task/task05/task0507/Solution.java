package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
          double num = 0;
          double sum = 0;
          int count = 0;

          Scanner scanner = new Scanner(System.in);
          while (num != -1) {
            int scanned = scanner.nextInt();
            num = Double.parseDouble(String.valueOf(scanned));
            if (num != -1) {
              sum += num;
              count++;
            }
          }
          if (count != 0) {
            System.out.println(sum / count);
          }
          else {
            System.out.println("Nothing");
          }
    }
}

