package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double t = Double.parseDouble(br.readLine());

      double chislo  = t % 5;
      if (chislo < 3){
        System.out.println("зелёный");
      }
      else if ((chislo >= 3) & (chislo < 4)){
        System.out.println("жёлтый");
      }
      else if ((chislo >= 4) & (chislo < 5)){
        System.out.println("красный");
      }
    }
}