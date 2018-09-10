package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      // Создал массив строк
      String[] lines = new String[10];
      // Создал массив чисел
      int number[] = new int[10];

      //заполнил массивы
      for (int i = 0; i < lines.length; i++) {
        lines[i] = reader.readLine();
        number[i] = lines[i].length();
      }

      //Вывел результат
      for (int a = 0; a < number.length; a++) {
        System.out.println(number[a]);
      }
    }
}
