package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
      HashMap<String, String> map = new HashMap<>();

      map.put("Pepa", "Ugis");
      map.put("Pepa", "Ugis");
      map.put("Stolone", "Ugis");
      map.put("Tuu", "Povar");
      map.put("Peterson", "Janis");
      map.put("Ivanov", "Janis");
      map.put("Petrov", "Vasja");
      map.put("Kot", "Kil");
      map.put("QWERTY", "Ris");
      map.put("FGHJL", "Tort");

      return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
