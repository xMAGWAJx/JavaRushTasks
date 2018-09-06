package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String oldfatherName = reader.readLine();
    Cat catOldfather = new Cat(oldfatherName);
    String oldmotherName = reader.readLine();
    Cat catOldmother = new Cat(oldmotherName);
    String fatherName = reader.readLine();
    Cat catFather = new Cat(fatherName, null, catOldfather);
    String motherName = reader.readLine();
    Cat catMother = new Cat(motherName, catOldmother, null);
    String sunName = reader.readLine();
    Cat catSun = new Cat(sunName, catMother, catFather);
    String daughterName = reader.readLine();
    Cat catDaughter = new Cat(daughterName, catMother, catFather);
    System.out.println(catOldfather);
    System.out.println(catOldmother);
    System.out.println(catFather);
    System.out.println(catMother);
    System.out.println(catSun);
    System.out.println(catDaughter);
  }

  public static class Cat {
    private String name;
    private Cat f;
    private Cat m;

    Cat(String name) {
      this.name = name;
    }

    Cat(String name, Cat m, Cat f) {
      this.name = name;
      this.m = m;
      this.f = f;
    }

    @Override
    public String toString() {
      if (f == null && m == null)
        return "The cat's name is " + name + ", no mother, no father";
      else if (m == null)
        return "The cat's name is " + name + ", no mother, father is " + f.name;
      else if (f == null)
        return "The cat's name is " + name + ", mother is " + m.name + ", no father";
      else
        return "The cat's name is " + name + ", mother is " + m.name + ", father is " + f.name;
    }
  }
}


