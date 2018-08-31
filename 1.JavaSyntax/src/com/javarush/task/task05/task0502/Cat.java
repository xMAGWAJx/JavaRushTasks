package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        Cat cat1 = new Cat();
        cat1.age = 6;
        cat1.weight = 6;
        cat1.strength = 6;

        Cat cat2 = new Cat();
        cat2.age = 5;
        cat2.weight = 4;
        cat2.strength = 7;

      if (age > anotherCat.age) {
        return true;
      }
      else if (weight > anotherCat.weight) {
        return true;
      }
      else if (strength > anotherCat.strength) {
        return true;
      }
      return false;

    }

    public static void main(String[] args) {

    }
}
