package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
     Human anna = new Human("Anna", false, 35);
     Human dana = new Human("Dnna", false, 26);
     Human gega = new Human("Gega", true, 30);
     Human qaga = new Human("Gaga", true, 50);
     Human peppapapa = new Human("Peppapapa", true, 10, gega, anna);
     Human drupa = new Human("Drupa", true, 15, qaga, dana);
     Human fozer = new Human("Fozer", true, 20, qaga, anna);
     Human uioopp = new Human("Uioopp", false, 13, qaga, anna);
     Human zula = new Human("Zula", false, 16, qaga, anna);
      System.out.println(anna);
      System.out.println(dana);
      System.out.println(gega);
      System.out.println(qaga);
      System.out.println(peppapapa);
      System.out.println(drupa);
      System.out.println(fozer);
      System.out.println(uioopp);
      System.out.println(zula);
    }

    public static class Human {
        //напишите тут ваш код
      String name;
      boolean sex;
      int age;
      Human father;
      Human mother;

      public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
      }

      public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
      }

      public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















