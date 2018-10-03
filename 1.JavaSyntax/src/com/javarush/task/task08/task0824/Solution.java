package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

      ArrayList<Human> parents1 = new ArrayList<>();
      ArrayList<Human> parents2 = new ArrayList<>();
      ArrayList<Human> grandparents = new ArrayList<>();
      ArrayList<Human> children = new ArrayList<>();

      grandparents.add(new Human("Babka1", false, 90, parents1));
      grandparents.add(new Human("Babka2", false, 80, parents2));
      grandparents.add(new Human("Ded1", true, 80, parents1));
      grandparents.add(new Human("Ded2", true, 85,parents2));

      parents1.add(new Human("Father", true, 45,children));
      parents2.add(new Human("Mother", true, 40,children));

      children.add(new Human("Child1", true, 20));
      children.add(new Human("Child2", true, 20));
      children.add(new Human("Child2", true, 20));

      for (Human x : grandparents) {
        System.out.println(x);
      }

      for (Human x : parents1) {
        System.out.println(x);
      }

      for (Human x : parents2) {
        System.out.println(x);
      }

      for (Human x : children) {
        System.out.println(x);
      }

    }

    public static class Human {
        //напишите тут ваш код
      String name;
      Boolean sex;
      int age;
      ArrayList<Human> children = new ArrayList<>();

      public Human(String name, Boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
      }

      public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = children;
      }

      public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
