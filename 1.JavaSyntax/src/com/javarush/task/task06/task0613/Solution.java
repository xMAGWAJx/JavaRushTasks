package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

import static com.javarush.task.task06.task0613.Solution.Cat.catCount;

public class Solution {
  public static void main(String[] args) {
    //создай 10 котов
    for (int i = 0; i < 10; i++){
      Cat cat = new Cat();
    }
    //выведи значение переменной catCount
    System.out.println(catCount);
  }

  public static class Cat {
    //создай статическую переменную catCount
    public static int catCount = 0;
    //создай конструктор
    public Cat() {
      catCount++;
    }
  }
}
