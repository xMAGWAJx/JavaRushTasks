package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
  public static void main(String[] args) {
    Set<Cat> cats = createCats();

    //напишите тут ваш код. step 3 - пункт 3
    cats.remove(cats.toArray()[0]);
    printCats(cats);
  }

  public static Set<Cat> createCats() {
    //напишите тут ваш код. step 2 - пункт 2
    HashSet<Cat> catSet = new HashSet<Cat>();
    Cat newCat = new Cat();
    catSet.add(newCat);

    newCat = new Cat();
    catSet.add(newCat);

    newCat = new Cat();
    catSet.add(newCat);

    return catSet;
  }

  public static void printCats(Set<Cat> cats) {
    // step 4 - пункт 4
    for (Cat cat : cats) {
      System.out.println(cat);
    }
  }

  // step 1 - пункт 1
  public static class Cat {

  }
}
