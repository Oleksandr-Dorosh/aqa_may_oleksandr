package org.homework_6;

public class Task_1 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0, a = 2; i < mas.length; a = a + 2, i++) {
            mas[i] = a;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}