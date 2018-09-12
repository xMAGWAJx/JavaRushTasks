package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> list = new ArrayList<String>();
      for (int i = 0; i < 10; i++) {
        list.add(reader.readLine());
      }

      String bufferMin = (list.get(0).length() <= list.get(1).length()) ? list.get(0) : list.get(1);
      String bufferMax = (list.get(0).length() >= list.get(1).length()) ? list.get(0) : list.get(1);

      for (byte i = 2; i < 10; i++)
      {
        bufferMin = (bufferMin.length() <= list.get(i).length()) ? bufferMin : list.get(i);
        bufferMax = (bufferMax.length() >= list.get(i).length()) ? bufferMax : list.get(i);
      }

      System.out.println(list.indexOf(bufferMax) > list.indexOf(bufferMin) ? bufferMin : bufferMax);
    }
}
