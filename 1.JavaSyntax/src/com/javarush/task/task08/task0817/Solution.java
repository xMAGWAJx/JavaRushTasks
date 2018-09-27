package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        //map.put("Фамилия", "Имя");
        map.put("Pepa", "Ugis");
        map.put("Kika", "Tata");
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
      HashMap<String, String> copy = new HashMap<>(map);
      for (Map.Entry<String, String> pair : copy.entrySet()) {
        int freqeuncy = Collections.frequency(copy.values(), pair.getValue());
        if (freqeuncy > 1) removeItemFromMapByValue(map, pair.getValue());
      }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
