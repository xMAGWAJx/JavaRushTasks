package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

  String name = null;
  int age = 100500;
  int weight = 999;
  String address = null;
  String color = "Black";

  public void initialize (String name) {
    this.name = name;
    this.age = age;
    this.weight = age;
    this.color = color;
  }

  public void initialize (String name, int weight, int age) {
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = color;
  }

  public void initialize (String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void initialize (int weight, String color){
    this.weight = weight;
    this.color = color;
  }

  public void initialize (int weight, String color, String address) {
    this.age = age;
    this.weight = weight;
    this.address = address;
    this.color = color;
  }

    public static void main(String[] args) {

    }
}
