package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
  public static void main(String[] args) throws Exception {
    int i = 0;
    while (i <= 9){
      i++;
      int j = 1;
      while (j<=10 && i<=10){
        int table = i * j;
        System.out.print(table + " ");
        j++;
      }
      System.out.println();
    }
  }
}
