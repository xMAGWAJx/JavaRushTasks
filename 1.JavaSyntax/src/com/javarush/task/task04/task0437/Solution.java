package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
          for (int a = 1; a < 11; a++) {
            for (int b = 0; b < a; b++)
              System.out.print(8);
              System.out.println();
          }
    }
}
