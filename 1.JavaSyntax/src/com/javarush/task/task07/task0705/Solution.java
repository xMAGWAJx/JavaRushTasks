package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int numbersTwenty[] = new int[20];
      int numbersTenFirstHalf[] = new int[10];
      int numbersTenSecondHalf[] = new int[10];

      for (int i = 0; i < numbersTwenty.length; i++){
        numbersTwenty[i] = Integer.parseInt(reader.readLine());
      }

      for (int i = 0; i < 10; i++){
        numbersTenFirstHalf[i] = numbersTwenty[i];
        numbersTenSecondHalf[i] = numbersTwenty[10 + i];
        System.out.println(numbersTenSecondHalf[i]);
      }
    }
}
