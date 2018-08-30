package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();

      for (int a = 0; a < 10; a++) {
        System.out.println(name + " любит меня.");
      }

    }
}
