package com.javarush.task.task07.task0701;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

  public static int[] initializeArray() throws IOException {
    // создай и заполни массив
    int numbers[] = new int[20];
    for(int i = 0; i < numbers.length; i++) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      numbers[i] = Integer.parseInt(reader.readLine());
    }
    return numbers;
}

    public static int max(int[] array) {
        // найди максимальное значение
      int [] g = array;
      int max = g[0];
      for (int i = 1; i < array.length; i++){
        if(g[i] > max) max = g[i];
      }
      return max;
    }
}
