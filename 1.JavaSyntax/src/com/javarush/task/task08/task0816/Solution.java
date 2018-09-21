package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
      map.put("Pantalone", df.parse("SEPTEMBER 5 1978"));
      map.put("Tatan", df.parse("OCTOBER 11 1965"));
      map.put("Chan", df.parse("JANUARY 5 1978"));
      map.put("Buba", df.parse("NOVEMBER 15 1979"));
      map.put("Pepa", df.parse("JULY 25 1968"));
      map.put("Kupa", df.parse("MAY 3 1978"));
      map.put("Fap", df.parse("APRIL 23 1999"));
      map.put("Trap", df.parse("FEBRUARY 11 1987"));
      map.put("Map", df.parse("AUGUST 8 1966"));

      return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
      Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

      while (iter.hasNext()) {
        HashMap.Entry<String, Date> x = iter.next();

        if (x.getValue().getMonth() > 4 & x.getValue().getMonth() < 8) {
          iter.remove();
        }
      }
    }

    public static void main(String[] args) {

    }
}
