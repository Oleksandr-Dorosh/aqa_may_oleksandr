package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.hasNext() ? scanner.nextInt() : 0;
        System.out.println(num % 10 + " " + num / 10);
    }
}
