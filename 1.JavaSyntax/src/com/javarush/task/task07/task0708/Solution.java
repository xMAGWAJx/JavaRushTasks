package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
  private static List<String> strings = new ArrayList<String>();

  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 5; i++) {
      String s = reader.readLine();
      strings.add(s);
    }
    int Lmax = strings.get(0).length();

    for (int i = 1; i < strings.size(); i++) {
      if (strings.get(i).length() > Lmax) Lmax = strings.get(i).length();
    }
    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).length() == Lmax) {
        System.out.println(strings.get(i));
      }
    }
  }
}