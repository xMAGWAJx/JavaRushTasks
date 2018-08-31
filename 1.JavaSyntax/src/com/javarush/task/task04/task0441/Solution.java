package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      if (a <= b && b >= c && a >= c || a >= b && b <= c && a <= c || a >= b && b >= c && a <= c) {
        System.out.println(a);
      }
      else if (a >= b && b >= c && a >= c || a <= b && b <= c && a <= c || a <= b && b <= c && a >= c) {
        System.out.println(b);
      }
      else if (a <= b && b >= c && a <= c || c >= b && c <= a && a <= b || c >= b && c <= a && a >= b) {
        System.out.println(c);
      }
    }
}
