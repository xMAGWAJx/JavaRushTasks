package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
      int t,k;
      int table[][] = new int[10][10];
      for (t = 1; t < 11; t++){
        for (k = 1; k < 11; k++){
          System.out.print(t * k + " ");
        }
        System.out.println();
      }
    }
}