package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();

      if ((number % 2) == 0 && (number > 0 && number <= 9)) {
        System.out.println("четное однозначное число");
      }
      if ((number%2) !=0 && (number > 0 && number <= 9)) {
        System.out.println("нечетное однозначное число");
      }
      if ((number % 2) == 0 && (number >= 10 && number <= 99)) {
        System.out.println("четное двузначное число");
      }
      if ((number%2) !=0 && (number >= 10 && number <= 99)) {
        System.out.println("нечетное двузначное число");
      }
      if ((number % 2) == 0 && (number >= 100 && number <= 999)) {
        System.out.println("четное трехзначное число");
      }
      if ((number%2) !=0 && (number >= 100 && number <= 999)) {
        System.out.println("нечетное трехзначное число");
      }
    }
}
