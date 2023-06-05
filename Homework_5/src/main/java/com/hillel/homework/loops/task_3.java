package com.hillel.homework.loops;


import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            System.out.print("factorial" + "=" + "" + i + "*");
            factorial = factorial * i;
            System.out.println(factorial);
        }
        System.out.println("factorial" + "=" + factorial);

    }
}