package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
      Woman woman = new Woman();
      Cat murzik = new Cat();
      murzik.owner = woman;
      Dog bau = new Dog();
      bau.owner = woman;
      Fish io = new Fish();
      io.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
