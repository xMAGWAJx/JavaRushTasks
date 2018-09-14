package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      ArrayList<String> list = new ArrayList<>();
      list.add(0,"мама");
      list.add(1,"мыла");
      list.add(2,"раму");

      for (int i = 0; i < list.size(); ++i){
        ++i;
        list.add(i, "именно");
      }
      list.forEach(System.out::println);
    }
}
