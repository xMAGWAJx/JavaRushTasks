package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    String name = "Pepa";
    int age = 100500;
    char sex = 'm';

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public char getSex() {
    return sex;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public static void main(String[] args) {

    }
}
