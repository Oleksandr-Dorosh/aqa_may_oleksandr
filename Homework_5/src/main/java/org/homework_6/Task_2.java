package org.homework_6;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0, num = 1; i < arr.length; i++, num += 2) {
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
