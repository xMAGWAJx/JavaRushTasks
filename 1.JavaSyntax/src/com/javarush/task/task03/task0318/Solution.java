package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();
      int age = scanner.nextInt();
      System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
