package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код

      HashMap<String, Integer> map = new HashMap<>();
      //map.put("Фамилия", "Имя");
      map.put("Pepa", 100);
      map.put("Kika", 400);
      map.put("Stolone", 500);
      map.put("Tuu", 900);
      map.put("Peterson", 333);
      map.put("Ivanov", 666);
      map.put("Petrov", 90);
      map.put("Kot", 3);
      map.put("QWERTY", 700);
      map.put("FGHJL", 1000);

      return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
      Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
      while (iterator.hasNext()){
        Map.Entry<String, Integer> path = iterator.next();
        int value = path.getValue();
        if (value < 500)  iterator.remove();
      }
    }

    public static void main(String[] args) {

    }
}