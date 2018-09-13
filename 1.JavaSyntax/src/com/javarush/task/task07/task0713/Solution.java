package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> devThree = new ArrayList<>();
    ArrayList<Integer> devTwo = new ArrayList<>();
    ArrayList<Integer> other = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      String s = reader.readLine();
      list.add(Integer.parseInt(s));
    }

    for (int j = 0; j < 20; j++) {
      if (list.get(j) % 3 == 0 & list.get(j) % 2 == 0) {
        devThree.add(list.get(j));
        devTwo.add(list.get(j));
      } else if (list.get(j) % 3 == 0) {
        devThree.add(list.get(j));
      } else if (list.get(j) % 2 == 0) {
        devTwo.add(list.get(j));
      } else other.add(list.get(j));
    }

    printList(devThree);
    printList(devTwo);
    printList(other);

  }

  public static void printList(List<Integer> list) {
    //напишите тут ваш код
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
