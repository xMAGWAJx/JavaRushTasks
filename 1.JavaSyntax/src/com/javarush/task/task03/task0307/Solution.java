package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
  public static void main(String[] args) {
    Zerg zerg1 = new Zerg();
    zerg1.name = "biba";
    Zerg zerg2 = new Zerg();
    zerg2.name = "biba1";
    Zerg zerg3 = new Zerg();
    zerg3.name = "biba2";
    Zerg zerg4 = new Zerg();
    zerg4.name = "biba3";
    Zerg zerg5 = new Zerg();
    zerg5.name = "biba4";

    Protoss protoss1 = new Protoss();
    protoss1.name = "baba";
    Protoss protoss2 = new Protoss();
    protoss2.name = "baba2";
    Protoss protoss3 = new Protoss();
    protoss3.name = "baba3";

    Terran terran1 = new Terran();
    terran1.name = "ter1";
    Terran terran2 = new Terran();
    terran2.name = "ter2";
    Terran terran3 = new Terran();
    terran3.name = "ter3";
    Terran terran4 = new Terran();
    terran4.name = "ter4";

  }

  public static class Zerg {
    public String name;
  }

  public static class Protoss {
    public String name;
  }

  public static class Terran {
    public String name;
  }
}
