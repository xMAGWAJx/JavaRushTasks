package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код кодд
      String phrase = "";
      for (String ch: s.split(" ")) {
        if (ch.length() > 1) {
          phrase += ch.substring(0, 1).toUpperCase() + ch.substring(1) + " ";
        }
      }
      System.out.println(phrase.trim());
    }
}
