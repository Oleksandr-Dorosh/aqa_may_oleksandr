package org.example;

    import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x >= 10 && x <= 99) {
            int a = x / 10;
            int b = x % 10;

            int weight = a + b;
            System.out.println("numb weight" + x + ":" + weight);

        }
    }
}