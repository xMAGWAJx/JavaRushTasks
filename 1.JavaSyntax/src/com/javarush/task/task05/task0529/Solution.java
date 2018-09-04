package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int sum = 0;
      boolean summa = true;
      while (summa) {
        String number = reader.readLine();
        if (number.equals("сумма")) {
          break;
        }
        Integer convert = Integer.parseInt(number);
        sum = sum + convert;
      }
      System.out.println(sum);
    }
}
