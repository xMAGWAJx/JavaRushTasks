package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int day = scanner.nextInt();
    if (day == 1) {
      System.out.println("понедельник");
    }
    if (day == 2) {
      System.out.println("вторник");
    }
    if (day == 3) {
      System.out.println("среда");
    }
    if (day == 4) {
      System.out.println("четвер");
    }
    if (day == 5) {
      System.out.println("пятница");
    }
    if (day == 6) {
      System.out.println("суббота");
    }
    if (day == 7) {
      System.out.println("воскресенье");
    }
    if (day > 7) {
      System.out.println("такого дня недели не существует");
    }
  }
}