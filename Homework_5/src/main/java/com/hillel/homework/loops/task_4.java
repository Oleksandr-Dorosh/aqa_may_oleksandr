package com.hillel.homework.loops;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            while (x != 0) {
                sum = sum + x % 10;
                x = x / 10;
            }
            System.out.println("сума введених чисел" + "=" + sum);
        }
    }
}
