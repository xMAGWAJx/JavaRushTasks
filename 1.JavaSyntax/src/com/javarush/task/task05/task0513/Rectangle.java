package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize (int top) {
      this.top = top;
    }

    public void initialize (int top, int left) {
      this.top = top;
      this.left = left;
    }

    public void initialize (int top, int left, int witdth) {
      this.top = top;
      this.left = left;
      this.width = witdth;
    }

    public void initialize (int top, int left, int width, int height) {
      this.top = top;
      this.left = left;
      this.width = width;
      this.height = height;
    }

    public static void main(String[] args) {

    }
}
